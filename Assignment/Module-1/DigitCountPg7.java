package Assignment0407;

import java.util.Scanner;

public class DigitCountPg7
{
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter an integer number :");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String size = Integer.toString(n);
		
		System.out.println("Number of digits in the number :"+size.length());
	}

}
