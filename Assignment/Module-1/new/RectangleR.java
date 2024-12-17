package Assignment0407;

class RectangleN
{
	int length, bredth;
	
	public RectangleN(int l, int b)
	{
		// TODO Auto-generated constructor stub
		length = l;
		bredth = b;		
	}
	void print_area()
	{
		System.out.println(length*bredth);
	}
	
	void print_parameter()
	{
		System.out.println(2*(length+bredth));
	}
	
	class Square extends RectangleN
	{

		public Square(int s) 
		{
			super(s, s);
			// TODO Auto-generated constructor stub
		}
		
	}	
	 
	public class RectangleR 
	{
	
	public static void main(String[] args)
	{
		RectangleN rect = new RectangleN(5, 4);
		rect.print_area();
		rect.print_parameter();
	}

}
}

