package Assignment0407;

class Shap
{
	void print_shape()
	{
		System.out.println("\nThis is shape.");
	}
}
class Rect extends Shap
{
	void print_rect()
	{
		System.out.println("\nThis is rectangular shape.");
	}
}
interface Circle 
{
	void circle();
}
class Square extends Rect implements Circle
{

	void square()
	{
		System.out.println("\nThis is circular shape.");
	}
	
	@Override
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println("\nSquare is a rectangle.");
	}
	
}


public class ShapePg34 
{
	public static void main(String[] args) 
	{
		Square s1 = new Square();
		s1.print_shape();
		s1.print_rect();
		s1.circle();
		s1.square();
	}
}

