package Assignment0407;

//Write a program in Java to display the pattern like right angle triangle with a number.

public class Pattern1Pg5 
{
	
	public static void main(String[] args)
	{
		// Outer loop for rows
		for(int i=1; i<=5; i++)
		{
			// Inner loop for numbers in each row
			for(int j=1; j<=i; j++)
			{
				// Print the number without a newline
				System.out.print(j);
			}
			// Move to the next line after each row
				System.out.println();
			
		}
		
	}

}
