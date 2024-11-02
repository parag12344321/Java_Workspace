package Assignment0407;


abstract class Marks
{
	abstract float getPercentage();
}

class A extends Marks
{
	private float sub1, sub2, sub3;
	
	public A(float s1, float s2, float s3)
	{
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}
	public float getPercentage()
	{
		return ((sub1+sub2+sub3)/300)*100;
	}
}
class B extends Marks
{
	private float sub1, sub2, sub3, sub4;
	
	public B(float s1, float s2, float s3, float s4)
	{
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
	}
	public float getPercentage()
	{
		return ((sub1+sub2+sub3+sub4)/400)*100;
	}
	
}

public class AbstractMarksPg29 
{
	
	public static void main(String[] args)
	{
		A studentA = new A(82, 70, 90);
		B studentB = new B(77, 81, 69, 95);
		
		System.out.println("Percentage of marks for student A :"+ studentA.getPercentage()+"%");
		System.out.println("Percentage of marks for student B :"+ studentB.getPercentage()+"%");
	}

}
