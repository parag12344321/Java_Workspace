package Assignment0407;

public class PrintNumberPg20
{
	// Method to print an integer

    public void printn(int num)
    {
        System.out.println("Integer: " + num);
    }

    // Method to print a float

    public void printn(float num) 
    {
     
    	System.out.println("Float: " + num);

    }

   

    // Method to print a double

    public void printn(double num) 
    {

        System.out.println("Double: " + num);

    }

   

    // Method to print a long

    public void printn(long num) 
    {

        System.out.println("Long: " + num);

    }

   

    // Method to print a boolean

    public void printn(boolean value) 
    {

        System.out.println("Boolean: " + value);

    }

   

    // Method to print a string

    public void printn(String str) {

        System.out.println("String: " + str);

    }

   

    // Main method to print the class
	public static void main(String[] args) 
	{
		PrintNumberPg20 obj = new PrintNumberPg20();
        obj.printn(10);
        obj.printn(3.14f);
        obj.printn(3.14159);
        obj.printn(100000000000L);
        obj.printn(true);
        obj.printn("Tops Technology");		
		
	}

}
