package Task159;

/*Write a Program to check the given number is Positive, Negative.*/

public class Positive 
{

	public static void main(String[] args) 
	{
		float a = (float)(10.2);
				
		if(a >= 0.0)
		{
			System.out.println("a is Positive No."+ a);
		}
		else if(a <= 0.0)
		{
			System.out.println("a is Negetive No."+ a);
		}
		else
		{
			System.out.println("none of"+ a);
		}
	}
	
}
