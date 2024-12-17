package Assignment0407;
//W.A.J.P to find all interleaving of given
import java.util.HashSet;
import java.util.Set;

public class InterleavingStringPg18
{
	// Define a method to find all interleavings of two strings.
	public static void allInterleavings(String res, String P, String Q, Set < String > out) 
	{
		// If both strings are empty, add the result to the output set.
		  if (P.length() == 0 && Q.length() == 0) 
		  {
		   out.add(res);
		   return;
		  }
		  
		// If string P is not empty, recursively call allInterleavings with the first character of P removed.
		  if (P.length() > 0)
		  {
		   allInterleavings(res + P.charAt(0), P.substring(1), Q, out);
		  }
		  
		// If string Q is not empty, recursively call allInterleavings with the first character of Q removed.
		  if (Q.length() > 0)
		  {
		   allInterleavings(res + Q.charAt(0), P, Q.substring(1), out);
		  }
	}

		 public static void main(String[] args) 
		 {
			// Define the input strings.
			 String P = "WX";
			 String Q = "YZ";
			 
			// Print the given strings
			 System.out.println("The given strings are: " + P + "  " + Q);
			 System.out.println("The interleavings strings are: ");
			 
			// Create a HashSet to store unique interleavings.
			 Set < String > out = new HashSet < > ();
			 
			// Call the allInterleavings method to generate interleavings of the input strings.
			 allInterleavings("", P, Q, out);

			// Print all the generated interleavings using streams.
			 out.stream().forEach(System.out::println);
			 
		 }
}


