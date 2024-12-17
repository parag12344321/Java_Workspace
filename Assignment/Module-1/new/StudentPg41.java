package Assignment0407;

import java.io.DataInputStream;
import java.io.IOException;

class AgeOutOfRangeException extends Exception{}

class NameNotValidException extends Exception{}

class Student
{
    int RollNo, Age,j,k=-1;
    String Name,Course;
    char ch[]={'!','@','#','$','%','^','&','*'};
    Student(int rno, String name, int age, String course)
    {
    try
    {
        RollNo = rno;
        Name = name;
        Age = age;
        Course = course;
        if(Age<15 || Age>21)
        throw new AgeOutOfRangeException();
        for(int i=0,j=0; i<Name.length() && j<ch.length ; i++,j++)
        if(Character.isDigit(Name.charAt(i))||(k!=Name.indexOf(ch[j])))
        throw new NameNotValidException();
    }
    catch(AgeOutOfRangeException e)
    {
        System.out.println("\nAgeNotWithinRangeException");
        System.exit(0);
    }
    catch(NameNotValidException e)
    {
        System.out.println("\nNameNotValidException");
        System.exit(0);
    }
    }
    public void printData()
    {
        System.out.println("\nROLL NO :"+RollNo+"\n"+
        "NAME :"+Name+"\n"+
        "AGE :"+Age+"\n"+
        "COURSE  :"+Course);
    }
}

public class StudentPg41 
{
	
	public static void main(String[] args) throws Exception 
	{
		DataInputStream in=new DataInputStream(System.in);

        System.out.print("\nENTER ROLL NO :");
        int rno=Integer.parseInt(in.readLine());
       
        System.out.print("ENTER NAME :");
        String sn=in.readLine();
       
        System.out.print("ENTER AGE :");
        int age=Integer.parseInt(in.readLine());
       
        System.out.print("ENTER COURSE :");
        String cn=in.readLine();
       
        Student s1 = new Student(rno,sn,age,cn);
       
        s1.printData();
    }
}


