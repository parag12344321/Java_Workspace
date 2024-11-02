package Assignment0407;

public class AreaOfSqareRectPg22
{
	void Area(double side)
	{
		System.out.println("Area of Square :" + side * side);
	}
	void Area(float side)
	{
		System.out.println("Area of Square :" + side * side);
	}
	
	void Area(double length, double breadth)
	{
		System.out.println("Area of Rectangle :" + length * breadth);
	}
	void Area(float length, float breadth)
	{
		System.out.println("Area of Rectangle :" + length * breadth);
	}
	
	public static void main(String[] args)
	{
		AreaOfSqareRectPg22 s = new AreaOfSqareRectPg22();
		s.Area(10);
		s.Area(5.2);
		s.Area(5, 5);
		s.Area(3.2, 4.2);
				
	}

}
