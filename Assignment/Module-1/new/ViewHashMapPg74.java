package Assignment0407;

import java.util.HashMap;

public class ViewHashMapPg74 
{
	
	public static void main(String args[])
	{  
		 //In Java, HashMap is part of the Java Collections Framework and is found in the java.util package. It provides the basic implementation of the Map interface in Java. 
		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		    hash_map.put(1,"Red");
		  hash_map.put(2,"Green");
		  hash_map.put(3,"Black");
		  hash_map.put(4,"White");
		  hash_map.put(5,"Blue");
		       
		   // checking collection view of the map
		   System.out.println("Collection view is: "+ hash_map.values());
		 }

}
