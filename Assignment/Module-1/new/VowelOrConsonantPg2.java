package Assignment0407;

import java.util.Scanner;

//Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

public class VowelOrConsonantPg2
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
//The toLowerCase() method returns the value of the string converted to lower case. 
//toLowerCase() does not affect the value of the string str itself.
        System.out.print("Input an alphabet: ");
        String input = sc.next().toLowerCase();

//the boolean keyword is used to declare variables that can store one of two possible values: true or false.
//result in a Boolean value i.e true or false. they can be formed using logical operators (&&, ||, !).Ex: (a>b && a> c) is a Boolean expression.
//input.charAt() is a method used to retrieve a specific character from a String at a particular index.
        //ASCII value of uppercase alphabets(A to Z) are from 65 to 90.
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        //ASCII value of lowercase alphabets(a to z) are from 97 to 122.
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");
        
        //The length() method returns the length of a specified string.
        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }

		
		
}
		
}

