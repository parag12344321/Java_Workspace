package Assignment0407;

import java.util.Scanner;

class Complex
{
	int real, imaginary;
	
	public Complex() 
	{
		// TODO Auto-generated constructor stub
	}
	Complex(int tempReal, int tempImaginary)
	{
		real = tempReal;
		imaginary = tempImaginary;
	}
	
	Complex addComp(Complex c1, Complex c2)
	{
		// Creating temporary variable 
        Complex temp = new Complex(); 
  
        // Adding real part of complex numbers 
        temp.real = c1.real + c2.real; 
  
        // Adding Imaginary part of complex numbers 
        temp.imaginary = c1.imaginary + c2.imaginary; 
  
        // Returning the sum 
        return temp; 
	}
}




public class ComplexPg26 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter First");
		Complex C1 = new Complex();
		int c1 = sc.nextInt();
	}	
	
}
