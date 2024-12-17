package Assignment0407;
//W.A.J.P to concatenate a given string to the end of another string.
public class ConcatenatePg14 
{
	
	public static void main(String[] args)
	{
		// Declare and initialize two string variables, str1 and str2.
		String str1 = "Tops";
		String str2 = "Technology";
		
		// Print the first string.
		System.out.println("String 1: "+str1);
		// Print the second string.
		System.out.println("String 2: "+str2);
		
		// Concatenate the two strings together and store the result in str3.
		String str3 = str1.concat(str2);
		
		// Display the newly concatenated string.
		System.out.println("Concatenate String : "+str3);
	}

}
