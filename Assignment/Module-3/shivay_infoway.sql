-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 28, 2024 at 07:34 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shivay_infoway`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `dno` (INOUT `depNum` INT)   BEGIN	
    SELECT e.ename, d.dname FROM employee AS e 
    LEFT JOIN dept AS d ON e.Deptno = d.Deptno;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `dept`
--

CREATE TABLE `dept` (
  `Deptno` int(2) NOT NULL,
  `Dname` varchar(14) DEFAULT NULL,
  `Loc` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dept`
--

INSERT INTO `dept` (`Deptno`, `Dname`, `Loc`) VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONSOPER', 'BOSTTON');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Empno` int(4) NOT NULL,
  `Ename` varchar(10) DEFAULT NULL,
  `Job` varchar(9) DEFAULT NULL,
  `Mgr` int(4) DEFAULT NULL,
  `Hiredate` date DEFAULT NULL,
  `Sal` decimal(7,2) DEFAULT NULL,
  `Comm` decimal(7,2) DEFAULT NULL,
  `Deptno` int(2) DEFAULT NULL,
  `Action_Performed` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`, `Action_Performed`) VALUES
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 801.00, NULL, 20, NULL),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600.00, NULL, 30, NULL),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250.00, 500.00, 30, NULL),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975.00, NULL, 20, NULL),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250.00, 1400.00, 30, NULL),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850.00, NULL, 30, NULL),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450.00, NULL, 10, NULL),
(7788, 'SCOTT', 'ANALYST', 7566, '1987-06-11', 3000.00, NULL, 20, NULL),
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000.00, NULL, 10, NULL),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-08-09', 1500.00, 0.00, 30, NULL),
(7876, 'ADAMS', 'CLERK', 7788, '1987-07-13', 1100.00, NULL, 20, NULL),
(7900, 'JAMES', 'CLERK', 7698, '1981-03-12', 950.00, NULL, 30, NULL),
(7902, 'FORD', 'ANALYST', 7566, '1981-03-12', 3000.00, NULL, 20, NULL),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300.00, NULL, 10, NULL);

--
-- Triggers `employee`
--
DELIMITER $$
CREATE TRIGGER `mytrigger` AFTER UPDATE ON `employee` FOR EACH ROW BEGIN
INSERT INTO emp_log SET Action='New Salary', New_salary=new.Sal;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `emp_log`
--

CREATE TABLE `emp_log` (
  `Emp_id` int(5) NOT NULL,
  `Log_date` date DEFAULT NULL,
  `New_salary` int(10) DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emp_log`
--

INSERT INTO `emp_log` (`Emp_id`, `Log_date`, `New_salary`, `Action`) VALUES
(0, NULL, 801, 'New Salary');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Rno` int(2) NOT NULL,
  `Sname` varchar(40) DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  `State` varchar(20) DEFAULT NULL,
  `Pin` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Stand-in structure for view `v1`
-- (See below for the actual view)
--
CREATE TABLE `v1` (
`ename` varchar(10)
,`job` varchar(9)
,`dname` varchar(14)
,`loc` varchar(13)
);

-- --------------------------------------------------------

--
-- Structure for view `v1`
--
DROP TABLE IF EXISTS `v1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v1`  AS SELECT `e`.`Ename` AS `ename`, `e`.`Job` AS `job`, `d`.`Dname` AS `dname`, `d`.`Loc` AS `loc` FROM (`employee` `e` left join `dept` `d` on(`e`.`Deptno` = `d`.`Deptno`)) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dept`
--
ALTER TABLE `dept`
  ADD PRIMARY KEY (`Deptno`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Empno`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Rno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
