package Assignment0407;

import java.util.HashSet;

public class ConvertHashSetPg67 
{
	
	public static void main(String[] args)
	{
		{ 
	        HashSet<String> set = new HashSet<String>(); 
	        set.add("Red"); 
	        set.add("Green"); 
	        set.add("Black"); 
	        set.add("White"); 
	        set.add("Pink"); 
	  
	        System.out.println("Hash Set Contains :" + set); 
	        String arr[] = new String[set.size()]; 
	          
	        int i=0; 
	        
	        // iterating over the hashset 
	        for(String ele:set)
	        { 
	          arr[i++] = ele; 
	        } 
	  
	        for (String n : arr) 
	            System.out.println(n); 
	    } 
  }

}
