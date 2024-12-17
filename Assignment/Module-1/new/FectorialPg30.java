package Assignment0407;

public class FectorialPg30
{
	static int Fectorial(int n)
	{
		int res = 1, i;
		for (i=2; i<=n; i++)
			res*=i;
		return res;
	}
	public static void main(String[] args)
	{
		int num =  4;
		int num2 = 3;
		int num3 = 2;
		int num4 = 1;
		
		System.out.println("Fectorial of "+ num +"!=1*2*3*4 "+"="+" " + Fectorial(4));
		System.out.println("Fectorial of "+ num2 +"!=1*2*3 "+"="+" " + Fectorial(3));
		System.out.println("Fectorial of "+ num3 +"!=1*2* "+"="+" " + Fectorial(2));
		System.out.println("Fectorial of "+ num4 +"!=1 "+ "="+" " + Fectorial(1));
		
		
		
	}

}
