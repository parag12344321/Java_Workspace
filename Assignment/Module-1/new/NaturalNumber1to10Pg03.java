package Assignment0407;

//Write a program in Java to display the first 10 natural numbers using while loop.

//natural numbers are counting numbers and they do not include 0 or any negative or fractional numbers.

public class NaturalNumber1to10Pg03
{
  public static void main(String[] args) 
  {
//The program initializes the variable number to 1, which is the first natural number.
//The while loop runs as long as the value of number is less than or equal to 10.
//Inside the loop, it prints the current value of number and then increments number by 1.
//The loop continues until number becomes 11, at which point the condition number <= 10 is no longer true, and the loop exits.
	  
	  int count = 1;// Initialize count to 1
	  
	  while(count <= 10)
	  {
		  
		  System.out.println(count);
		  count++;
	  }
	
  }
}
