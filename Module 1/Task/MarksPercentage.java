package Task159;

/*Write a program to calculate sum of 5 subjects & find the percentage.*/

public class MarksPercentage
{
	
	public static void main(String[] args) 
	{
		
		int sub1 = 45;
		int sub2 = 42;
		int sub3 = 55;
		int sub4 = 63;
		int sub5 = 72;
		
		int totl = sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total Marks :" + totl);
		
		float per = (float)(totl/5);
		System.out.println("Total Percentage :" + per);
		
		
	}

}
