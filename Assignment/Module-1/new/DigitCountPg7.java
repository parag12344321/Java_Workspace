package Assignment0407;

//Write a Java program that reads a positive integer and count the number of digits the number.

import java.util.Scanner;

public class DigitCountPg7
{
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter an integer number :");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//This method is specific to the Integer class and is used to convert an int to a string.
		String size = Integer.toString(n);
		
		System.out.println("Number of digits in the number :"+size.length());
	}

}
