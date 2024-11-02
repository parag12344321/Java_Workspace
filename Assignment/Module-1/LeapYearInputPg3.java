package Assignment0407;

import java.util.Scanner;

public class LeapYearInputPg3 
{

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter Year");	
		int year = sc.nextInt();
		
		if(year % 4==0)
		{
			System.out.println(" Year "+ year + " is a leap year");
		}
		else
		{
			System.out.println(" Year " + year + " is not a leap year");
		}
	}
	
}
