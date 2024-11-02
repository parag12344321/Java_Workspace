package Assignment0407;

import java.util.Scanner;

public class ArithmeticExceptionPg35 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		try 
			{
				System.out.println(a / b); // throw Exception
			}
		catch (ArithmeticException e) 
			{
				//Exception handler
				System.out.println("Exception in thread main java.lang.ArithmeticException:/ by zero");
			}
	}
}
		
		
	
