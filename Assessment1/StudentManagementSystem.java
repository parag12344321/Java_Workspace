package Assesment1;

import java.util.ArrayList;
import java.util.Scanner;

// Student class to store student data
class Student
{
    int id;
    String fname;
    String lname;
    String contact;
    String subjone;
    String subjtwo;
    String subjthree;
    int marksone;
    int markstwo;
    int marksthree;
    int feesone;
    int feestwo;
    int feesthree;
    
    public Student(int id, String fname, String lname, String contact, String subjone,String subjtwo,
    	   String subjthree, int feesone,int feestwo,int feesthree, int marksone, int markstwo, int marksthree)
    {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.contact = contact;
        this.subjone = subjone;
        this.subjtwo = subjtwo;
        this.subjthree = subjthree;
        this.feesone = feesone;
        this.feestwo = feestwo;
        this.feesthree = feesthree;
        this.marksone = marksone;
        this.markstwo = markstwo;
        this.marksthree = marksthree;
    }

    public int getId() {
        return id;
    }
    public void getMarksone(int marksone) 
    {
        this.marksone = marksone;
    }
    public void getMarkstwo(int markstwo) 
    {
        this.markstwo = markstwo;
    }
    public void getMarksthree(int marksthree) 
    {
        this.marksthree = marksthree;
    }
    public void setMarksone(int marksone) 
    {
        this.marksone = marksone;
    }
    public void setMarkstwo(int markstwo) 
    {
        this.markstwo = markstwo;
    }
    public void setMarksthree(int marksthree) 
    {
        this.marksthree = marksthree;
    }
    public int getfeesone()
    {
        return feesone;
    }
    public int getfeestwo()
    {
        return feestwo;
    }
    public int getfeesthree()
    {
        return feesthree;
    }

    @Override
    public String toString() 
    {
        return "Serial Number: " + id + ", FirstName: " + fname + ", LastName: " + lname +","+
        		"Subject: " + subjone + ", Marks: " + marksone + ", Fees: "+ feesone +","+
        		"Subject: " + subjtwo + ", Marks: " + feestwo  + ",  Fees: "+ markstwo +","+
        		"Subject: " + subjthree +", Marks: " + marksthree +", Fees: "+ feesthree +","+
        		"Contact: " + contact;
        		
    }
}

// Main class for the Student Management System
public class StudentManagementSystem 
{
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        while (true) 
        {
            // Main menu display
            System.out.println("\n---Welcome to Student Management System ---");
            System.out.println("press 1 for Counsellor");
            System.out.println("press 2 for Faculty");
            System.out.println("press 3 for Student");
            System.out.print("Enter a role id: ");
            
            int option = getUserInput();
            
            switch (option) 
            {
                case 1:
                    counselorMenu();
                    break;
                case 2:
                    facultyMenu();
                    break;
                case 3:
                    System.out.println("Student - Exit Program");//Exiting program. Goodbye!
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Function to display and handle the counselor menu
    private static void counselorMenu()
    {
        while (true) 
        {
            System.out.println("\n");//--- Counselor Menu ---
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View All Students");
            System.out.println("4. View Specific Student");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter a choice by counsellor: ");
            
            int option = getUserInput();
            
            switch (option) 
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    viewAllStudents();
                    break;
                case 4:
                    viewSpecificStudent();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Function to display and handle the faculty menu
    private static void facultyMenu() 
    {
    	System.out.print("Faculty wants to perform any other operations? (Y/N): ");
        String confirmation = sc.next();
        if (confirmation.equalsIgnoreCase("Y")) 
        {
             while (true) 
             {
            System.out.println("\n");//--- Faculty Menu ---
            System.out.println("1. Add Marks to Student ");
            System.out.println("2. View all student");
            System.out.print("Enter a choice by Faculty: ");
            
            int option = getUserInput();
            
            switch (option)
            {
                case 1:
                    addStudentMarks();
                    break;
                case 2:
                	viewAllStudents();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        
         }
      }
 }

    // Method to add a new student
    private static void addStudent() 
    {
        System.out.print("Enter a Serial Number: ");
        int id = getUserInput();
        
        System.out.print("Enter a First Name: ");
        String fname = sc.next();
        
        System.out.print("Enter a Last Name: ");
        String lname = sc.next();
        
        System.out.print("Enter a Subject: ");
        String subjone = sc.next();
        
        System.out.print("Enter a Marks: ");
        int marksone = sc.nextInt();
        
        System.out.print("Enter a Fees: ");
        int feesone = sc.nextInt();
        
        System.out.print("Enter a Subject: ");
        String subjtwo = sc.next();
        
        System.out.print("Enter a Marks: ");
        int markstwo = sc.nextInt();
        
        System.out.print("Enter a Fees: ");
        int feestwo = sc.nextInt();
        
        System.out.print("Enter a Subject: ");
        String subjthree = sc.next();
        
        System.out.print("Enter a Marks: ");
        int marksthree = sc.nextInt();
        
        System.out.print("Enter a Fees: ");
        int feesthree = sc.nextInt();
                
        String contact;
        while (true) 
        {
            System.out.print("Enter a Contact Number: ");
            contact = sc.next();
            if (contact.matches("\\d{10}")) 
            { // Simple validation for 10-digit number
                break;
            } 
            else
            {
                System.out.println("Invalid contact number. Please enter a 10-digit number.");
            }
        }
        
 studentList.add(new Student(id, fname, lname, contact,subjone,subjtwo, subjthree,feesone, marksone, feestwo, markstwo, feesthree, marksthree ));
        System.out.println("Student added successfully.");
    }

    // Method to remove a student by ID
    private static void removeStudent() 
    {
        System.out.print("Enter Student ID to remove: ");
        int id = getUserInput();
        
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        
        System.out.print("Are you sure you want to remove this student? (Y/N): ");
        String confirmation = sc.next();
        if (confirmation.equalsIgnoreCase("Y"))
        {
            studentList.remove(student);
            System.out.println("Student removed successfully.");
        }
        else 
        {
            System.out.println("Operation cancelled.");
        }
    }

    // Method to view all students
    private static void viewAllStudents() 
    {
        if (studentList.isEmpty()) 
        {
            System.out.println("No students to display.");
            return;
        }
        
        System.out.println("\n--- List of All Students ---");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    // Method to view a specific student by ID
    private static void viewSpecificStudent()
    {
        System.out.print("Enter Student ID to view: ");
        int id = getUserInput();
        
        Student student = findStudentById(id);
        if (student == null) 
        {
            System.out.println("Student not found.");
        } 
        else
        {
            System.out.println("Student Details: " + student);
        }
    }

    // Method to add marks for a student
    private static void addStudentMarks()
    {
        System.out.print("Enter Student ID to add marks: ");
        int id = getUserInput();
        
        Student student = findStudentById(id);
        if (student == null)
        {
            System.out.println("Student not found.");
            return;
        }
        
        System.out.print("Enter Marks: ");
        int marks1 = getUserInput();
        
        student.setMarksone(marks1);
        System.out.println("Marks added successfully.");
    }

    // Utility function to find a student by ID
    private static Student findStudentById(int id)
    {
        for (Student student : studentList) 
        {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // Utility function to get valid integer input
    private static int getUserInput() 
    {
        while (true)
        {
            try 
            {
                return sc.nextInt();
            } 
            catch (Exception e) 
            {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); // clear invalid input
            }
        }
    }
}
