package Assignment0407;

public class NestedTryBlocksPg37
{
	
	public static void main(String[] args)
	{
		
		try 
		{
	         int a[] = new int[5];
	         try {
	            int b = 0;
	            int c = 30/b;
	    }
	    catch(Exception e) 
	         {
	            System.out.println("Exception thrown: " + e);
	         }
	         	System.out.println("Access element three :" + a[5]);
	     }
	      		catch (Exception e) 
				{
	      			System.out.println("Exception thrown: " + e);
				}
	      			System.out.println("Out of the block");
	   	 }
		
}


