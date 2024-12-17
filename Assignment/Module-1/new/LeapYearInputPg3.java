package Assignment0407;

//Write a Java program that takes a year from user and print whether that year is a leap year or not.

import java.util.Scanner;

public class LeapYearInputPg3 
{

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter The Year:");	
		int year = sc.nextInt();
//% is the modulus operator, which calculates the remainder of division.
		//== operator is used for comparison.
		if(year % 4==0)
		{
			System.out.println("Year "+ year + " is a leap year");
		}
		else
		{
			System.out.println("Year " + year + " is not a leap year");
		}
	}
	
}
