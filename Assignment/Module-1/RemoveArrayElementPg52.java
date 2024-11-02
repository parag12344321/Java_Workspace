package Assignment0407;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayElementPg52 
{
	public static void main(String[] args) {
		
	
	
	List<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Green");
	  list_Strings.add("Red");
	  list_Strings.add("Orange");		  
	  list_Strings.add("Black");
	  list_Strings.add("White");
	  
	// Print the list
	  System.out.println(list_Strings);
	  
	// Remove the third element from the list.
	  list_Strings.remove(2);
	  // Print the list again
	  System.out.println("After removing third element from the list:\n"+list_Strings);
	  
	}  

}
