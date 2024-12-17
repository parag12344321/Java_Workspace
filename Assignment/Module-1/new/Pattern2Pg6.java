package Assignment0407;

//Write a program in Java to make such a pattern like right angle triangle with number increased by 1 The pattern like:

public class Pattern2Pg6 
{
	public static void main(String[] args)
	{
		int count = 1;
		// Outer loop for each row
	//The outer loop runs for i rows (in this case, a 4-row triangle).	
		for(int i=1; i<=4; i++)
		{
			// Inner loop for printing numbers in each row
//The inner loop prints the numbers for each row, starting from 1, and it prints i numbers in the ith row (i.e., the 1st row prints 1 number, the 2nd row prints 2 numbers, and so on).
			for(int j=1; j<=i; j++)
			{
				System.out.print(count);
				count++;// Increment the number
				
				
			}
			
				System.out.println(" ");// Print the current number
			
		}

	}
}
