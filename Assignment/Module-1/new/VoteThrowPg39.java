package Assignment0407;

import java.util.Scanner;

public class VoteThrowPg39 
{
	public static void main(String[] args) 
    {
		System.out.println("Please Enter Your Age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
	
	 
	        if(age<18)
	        {  
	        	//throw and throws in Java which can handle exceptions in Java.
	            //throw Arithmetic exception if not eligible to vote  
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else 
	        {  
	            System.out.println("\nWelcome to Vote");  
	        }     
		
    }
	    
}
