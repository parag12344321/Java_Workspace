package Task159;

/*Write a Program to check the given year is leap year or not.*/

public class LeapYear 
{
	
	public static void main(String[] args)

	{
		
		int year = 2023;
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
