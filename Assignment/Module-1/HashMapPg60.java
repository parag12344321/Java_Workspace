package Assignment0407;

import java.util.HashMap;
import java.util.Map;

public class HashMapPg60
{
	
	public static void main(String args[]) 
	{  
		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Green");
		  hash_map.put(2, "Red");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  for(Map.Entry x:hash_map.entrySet())
		  {  
			  System.out.println(x.getKey()+" "+x.getValue());  
		  }  
		 }  

}
