package Assignment0407;

import java.util.Scanner;

public class ForLoopPg4
{
	
	public static void main(String[] args)
	{
		
		int count,i, num, sum = 0;
		float average = 0;
		System.out.println("Enter the count of number :");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		
		for(i=0; i<count; i++)
		{
		
			num = sc.nextInt();
			sum = sum + num;
					
		}
		average = sum / count;
		System.out.println("Sum of entered numbers : " + sum);
		System.out.println("Average of entered numbers : " + average);
		
	}

}
