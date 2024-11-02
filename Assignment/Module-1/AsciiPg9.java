package Assignment0407;

import java.util.Scanner;

public class AsciiPg9 
{
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String ch;
		System.out.println("Enter the character :");
		ch = sc.nextLine();
		
		if(ch.length()==1)
		{
			int n = 0;
			n = ch.charAt(n);
			System.out.println("ASCII Value of "+" "+ch+" is"+" "+ n);
			
		}
		
	}

}
