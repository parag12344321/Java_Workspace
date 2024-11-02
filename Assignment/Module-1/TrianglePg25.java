package Assignment0407;

class Triangle
{
	int a,b,c;
	
	double PrintArea()
	{
		double p=(a+b+c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	double PrintPerimeter()
	{
		return (a+b+c)/2.0;
	}
}


public class TrianglePg25 
{
	
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.a=3;
		t.b=4;
		t.c=5;
		
		System.out.println("Area of Triangle is: " +t.PrintArea());
		System.out.println("Perimeter of Triangle is: " +t.PrintPerimeter());
	}

}
