package Assignment0407;

import java.util.ArrayList;
import java.util.List;

public class IterateArrayListPg48 
{
	
	public static void main(String[] args)
	{
		// Creae a list and add some citys to the list
		  List<String> list_city = new ArrayList<String>();
		  list_city.add("Jamnagar");
		  list_city.add("Rajkot");
		  list_city.add("Junagadh");
		  list_city.add("Ahmedabad");
		  list_city.add("Amreli");
		  // Print the list
		  for (String element : list_city) 
		  {
		    System.out.println(element);
		    
		   }

	}
	
}
