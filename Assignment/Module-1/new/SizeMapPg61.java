package Assignment0407;

import java.util.HashMap;

public class SizeMapPg61 
{
	
	public static void main(String args[]) 
	{  
		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Green");
		  hash_map.put(2, "Red");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  
		  System.out.println("The Number of key-value(size)mappings in a map: "+hash_map.size());
	}
}
