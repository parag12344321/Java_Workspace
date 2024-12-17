package Assignment0407;

//8)	Write a Java program to count the letters, spaces, numbers and other characters of an input string.
import java.util.Scanner;

public class CountPg8
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string :");
		str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		// Initialize counters for letters, spaces, numbers, and other characters
		int letters = 0, spaces = 0, numbers = 0, others = 0;
		// Iterate through each character in the input string
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isLetter(ch[i]))
				{
				// Count the letters
					letters++;
				}
			else if(Character.isSpaceChar(ch[i]))
			{
				// Count the spaces
				spaces++;
			}
			else if(Character.isDigit(ch[i]))
			{
				//// Count the numbers
				numbers++;
			}
			else 
			{
				// Count the other characters
				others++;
			}
		}
		System.out.println("String are : "+str);
		System.out.println("Letters are : "+letters);
		System.out.println("Spaces are : "+spaces);
		System.out.println("Numbers are : "+numbers);
		System.out.println("Others are : "+others);
	}

}
