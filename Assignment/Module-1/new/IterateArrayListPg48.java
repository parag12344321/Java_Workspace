package Assignment0407;

import java.util.ArrayList;
import java.util.List;

public class IterateArrayListPg48 
{
	
	public static void main(String[] args)
	{
//		// Creae a list and add some citys to the list
//		  List<String> list_city = new ArrayList<String>();
//		  list_city.add("Jamnagar");
//		  list_city.add("Rajkot");
//		  list_city.add("Junagadh");
//		  list_city.add("Ahmedabad");
//		  list_city.add("Amreli");
//		  // Print the list
//		  for (String element : list_city) 
//		  {
//		    System.out.println(element);
//		    
//		   }
//
//	}
	//	in Java, an Iterator is an interface that provides a way to traverse (iterate) through a collection of elements, such as a list, set, or map, without exposing the underlying implementation details. 
		// Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Iterate through the ArrayList using a for-each loop
        System.out.println("Iterating using a for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterate through the ArrayList using a for loop
        System.out.println("\nIterating using a traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Iterate through the ArrayList using an Iterator
        System.out.println("\nIterating using an Iterator:");
        var iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
	
}
