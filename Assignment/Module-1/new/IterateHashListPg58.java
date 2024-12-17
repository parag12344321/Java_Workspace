package Assignment0407;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IterateHashListPg58 
{
	
	public static void main(String[] args)
	{
		
		// Create a empty hash set
	    HashSet<String> h_set = new HashSet<String>();
	  // use add() method to add values in the hash set
	    h_set.add("Green");
	    h_set.add("Red");
	    h_set.add("Orange");		  
	    h_set.add("Black");
	    h_set.add("White");
	    
	 // set Iterator 
	    java.util.Iterator<String> p = h_set.iterator();
	  // Iterate the hash set
	   while (p.hasNext()) 
	   {
		   System.out.println(p.next());
	   }
		
	}

}
