package Assignment0407;

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
