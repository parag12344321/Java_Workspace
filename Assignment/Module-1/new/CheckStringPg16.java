// W.A.J.P to check whether a given string ends with the contents of another string. "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
package Assignment0407;
//
public class CheckStringPg16 
{
	
	public static void main(String[] args) 
	{
		String a = "Java Exercises";
		//The endsWith() method returns true if a string ends with a specified string.
		//Otherwise it returns false.
		System.out.println(a.endsWith("se"));
		
		//The endsWith() method is case sensitive.
		String b = "Java Exercise";
		System.out.println(b.endsWith("se"));
	}

}
