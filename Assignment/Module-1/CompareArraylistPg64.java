package Assignment0407;

import java.util.ArrayList;
import java.util.List;

public class CompareArraylistPg64 
{
	
	public static void main(String[] args)
	{
		
		ArrayList<String> a1 = new ArrayList<String>();
		  a1.add("Green");
		  a1.add("Red");
		  a1.add("Orange");		  
		  a1.add("Black");
		  a1.add("White");
		  
		  ArrayList<String> a2 = new ArrayList<String>();
		  a2.add("Green");
		  a2.add("Red");
		  a2.add("Orange");		  
		  a2.add("White");
		  
		//Storing the comparison output in ArrayList<String>
          ArrayList<String> a3 = new ArrayList<String>();
          for (String e : a1)
             a3.add(a2.contains(e) ? "Yes" : "No");
          System.out.println(a3);
		  
		  
		
	}

}
