package Assignment0407;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayListPg55 
{
	
	public static void main(String[] args) 
	{
		List<String> List1 = new ArrayList<String>();
		  List1.add("10");
		  List1.add("20");
		  List1.add("30");
		  List1.add("40");
		  System.out.println("List1: " + List1);
		  List<String> List2 = new ArrayList<String>();
		  List2.add("A");
		  List2.add("B");
		  List2.add("C");
		  List2.add("D");
		  System.out.println("List2: " + List2);
		  // Copy List2 to List1
		  Collections.copy(List1, List2);
		  System.out.println("Copy List1 to List2,\nAfter copy:");
		  System.out.println("List1: " + List1);
		  System.out.println("List2: " + List2);
	}

}
