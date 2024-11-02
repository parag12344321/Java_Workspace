package Assignment0407;

public class MultipleExceptionPg36 
{
	
	public static void main(String[] args) 
	{
		
		try
		{
            int a[] = new int[5];
                a[5] = 30/0;
        }
        catch (ArithmeticException e)
		{
            System.out.println(
                "Zero cannot divide any number");
        }
        catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println(
                "Index out of size of the array");
        }
    }
		
}


