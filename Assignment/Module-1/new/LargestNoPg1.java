package Assignment0407;


import java.util.Scanner;



public class LargestNoPg1 
{
	public static void main(String[] args) 
	{
		
		int num1, num2, num3, greatest;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number 1:");
	    num1 = sc.nextInt();
		
	    System.out.println("Enter the number 2:");
	    num2 = sc.nextInt();
		
	    System.out.println("Enter the number 3:");
	    num3 = sc.nextInt();
		
	    if(num1 > num2 && num1 > num3)
	    greatest = num1;
	    
	    else if(num2 > num1 && num2 > num3)
	    greatest = num2;
	    
	    else 
	    	greatest = num3;
	    
	    System.out.print("The greatest No. is :" + greatest);
	    
	    
	}
}
