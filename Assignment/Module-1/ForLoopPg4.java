package Assignment0407;

import java.util.Scanner;

public class ForLoopPg4
{
	
	public static void main(String[] args)
	{
		
		// Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables for sum and count of numbers
        int sum = 0;
        double average;
        
        // Input 5 numbers and calculate the sum
        System.out.println("Enter 5 numbers:");
//A for loop runs 5 times, each time adding the number entered by the user to the sum variable.
        for (int i = 0; i < 5; i++) 
        {
            // Read the number from the user
            int number = scanner.nextInt();
            
            // Add the number to the sum
            sum += number;
        }
        
        // Calculate the average
        average = sum / 5.0;
        
        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
		
	}

}
