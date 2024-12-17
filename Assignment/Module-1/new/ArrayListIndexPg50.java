package Assignment0407;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIndexPg50
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
		  // Retrive the first and third element
		  String element = list_Strings.get(0);
		  System.out.println("First element: "+element);
		  element = list_Strings.get(1);
		  System.out.println("Second element: "+element);
		  element = list_Strings.get(2);
		  System.out.println("Third element: "+element);
		  element = list_Strings.get(3);
		  System.out.println("Fourth element: "+element);
		  element = list_Strings.get(4);
		  System.out.println("Fifth element: "+element);
		  
		
	}

}
