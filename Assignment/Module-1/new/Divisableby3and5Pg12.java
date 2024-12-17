package Assignment0407;
//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
public class Divisableby3and5Pg12 
{

	public static void main(String[] args) 
	{
		System.out.println("Number divisable by 3");
		for(int i=1; i<=100; i++)
		{
			//// Check if the number is divisible by 3
			if(i%3==0)
			{
				System.out.print(i+ ", ");
			}
		}
		System.out.println("\nNumber divisable by 5");
		for(int i=1; i<=100; i++)
		{
			// Check if the number is divisible by 5
			if(i%5==0)
			{
				System.out.print(i+ ", ");
			}
		}
		System.out.println("\nNumber divisable by 3 and 5 both");
		for(int i=1; i<=100; i++)
		{
			//// Check if the number is divisible by both 3 and 5
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+ ", ");
			}
		}
		
	}
	
}
