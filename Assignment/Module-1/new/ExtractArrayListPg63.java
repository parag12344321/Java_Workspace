package Assignment0407;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtractArrayListPg63 
{
	
	public static void main(String[] args)
	{		
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Green");
		  list_Strings.add("Red");
		  list_Strings.add("Orange");		  
		  list_Strings.add("Black");
		  list_Strings.add("White");
		  
		  System.out.println("Original list: " + list_Strings);
		  List<String> sub_List = list_Strings.subList(0, 3);
		  System.out.println("List of first three elements: " + sub_List);
	}	

}
