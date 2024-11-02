package Assignment0407;

import java.util.Scanner;


	abstract class Shape

	{	

		abstract void RectangleArea(float length , float breadth);
		abstract void SquareArea(float radius);
		abstract void CircleArea(float side);
	}


	class Area extends Shape 
	{
		double Area = 0;
		void RectangleArea(float length, float breadth) 
		{
			Area = length * breadth;
			System.out.println("Area of rectangle is: " + Area);
		}


		void SquareArea(float Side)
		{
			Area = Side * Side;
			System.out.println("Area of Square is: " + Area);
		}


		void CircleArea(float radius) 
		{
			Area = (radius * radius) * 3.14;
			System.out.println("Area of Circle is: " + Area);
		}


}


	public class AbstactRectanglePg31
 {
		public static void main(String[] args)
	{

       Area a = new Area();
       Scanner in = new Scanner(System.in);
       
       System.out.print("Entrer length for rectangle: ");
       float len = in.nextFloat();
       System.out.print("Entrer breadth for rectangle: ");
       float bre = in.nextFloat();
       a.RectangleArea(len, bre);
       
       System.out.print("Entrer breadth for square: ");
       float sid = in.nextFloat();
       a.SquareArea(sid);
       
       System.out.print("Entrer breadth for circle: ");
       float rad = in.nextFloat();
       a.CircleArea(rad);
       

   }

}







