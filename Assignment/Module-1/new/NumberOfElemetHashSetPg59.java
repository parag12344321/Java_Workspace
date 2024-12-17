package Assignment0407;

import java.util.HashSet;

public class NumberOfElemetHashSetPg59
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
	    
	    System.out.println("Original Hash Set: " + h_set);
	    System.out.println("The Number of Elements in a Hash Set: " + h_set.size());
		
	}

}
