package Assignment0407;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPositionPg49 
{
	
	public static void main(String[] args)
	{
		
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Green");
		  list_Strings.add("Red");
		  list_Strings.add("Orange");		  
		  list_Strings.add("Black");
		  list_Strings.add("White");
		  
		// Print the list
		  System.out.println(list_Strings);
		  // Now insert a color at the first and last position of the list
		  list_Strings.add(0, "White");
		  // Print the list
		  System.out.println(list_Strings);
		}
		
}


