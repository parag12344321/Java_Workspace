package Assignment0407;
//W.A.J.P to get the character at the given index within the String. Original String = Tops Technologies! The character at position 0 is T, The character at position 10 is o
public class CharacterIndexPg13 
{
	
	public static void main(String[] args) 
	{
		// Declare and initialize a string variable "str" with the value "Tops Technologies!
		String str = "Tops Technologies!";
		// Print the original string.
		
		System.out.println("Original String = "+str);
		// Get the character at positions 0 and 10.
		
		int index1 = str.charAt(0);// Get the ASCII value of the character at position 0.
		int index2 = str.charAt(10);// Get the ASCII value of the character at position 10.
		
		// Print out the results.
		System.out.println("The Character at Position 0 is: "
		+(char)index1);// Print the character at position 0 by converting ASCII value to char.
		System.out.println("The Character at Position 10 is: "
		+(char)index2);// Print the character at position 10 by converting ASCII value to char.
		
		
		
	}
	

}
