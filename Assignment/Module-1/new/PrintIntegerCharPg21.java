package Assignment0407;
//Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters. For
// overloading in Java- class name same bt no of parameters are also different

public class PrintIntegerCharPg21
{
	
	public void print(int n, char c)
	{
		System.out.println("Integer :"+ n + ","+"\nCharacter :"+c);
	}
	
	public void print(char c, int n)
	{
		System.out.println("Character :"+ c +","+"\nInteger :"+ n);
	}
	
	public static void main(String[] args) 
	{
		PrintIntegerCharPg21 p = new PrintIntegerCharPg21();
		p.print(10, 'P');
		p.print('Q', 20);
		
		
	}

}
