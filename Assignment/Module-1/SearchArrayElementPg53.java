package Assignment0407;

import java.util.ArrayList;
import java.util.List;

public class SearchArrayElementPg53 
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
		  
		// Search the value Red
		    if (list_Strings.contains("Red")) 
		    {
		    	System.out.println("Found the element");
		    } 
		    else
		    {
		    	System.out.println("There is no such element");
		    }
		
	}

}
