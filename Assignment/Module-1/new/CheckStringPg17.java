package Assignment0407;
//W.A.J.P to check whether a given string starts with the contents of another string. Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts with Red? False
public class CheckStringPg17 
{
	
	public static void main(String[] args) 
	{
		//The startsWith() method returns true if a string starts with a specified string.
		String a = "Red is favorite color.";
		System.out.println(a.startsWith("Red"));
		
		String b = "Orange is also my favorite color.";
		System.out.println(b.startsWith("Red"));
	}

}
