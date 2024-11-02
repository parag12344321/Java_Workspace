package Assignment0407;

public class Divisableby3and5Pg12 
{

	public static void main(String[] args) 
	{
		System.out.println("Number divisable by 3");
		for(int i=1; i<=100; i++)
		{
			if(i%3==0)
			{
				System.out.print(i+ ", ");
			}
		}
		System.out.println("\nNumber divisable by 5");
		for(int i=1; i<=100; i++)
		{
			if(i%5==0)
			{
				System.out.print(i+ ", ");
			}
		}
		System.out.println("\nNumber divisable by 3 and 5 both");
		for(int i=1; i<=100; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+ ", ");
			}
		}
		
	}
	
}
