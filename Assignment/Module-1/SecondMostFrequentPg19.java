package Assignment0407;

public class SecondMostFrequentPg19 
{
	
	static final int NOOFCHARS = 256;
	 static char get2ndMostFreq(String str1) 
	 {
		 int[] ctr = new int[NOOFCHARS];
		 int i;
		 for (i = 0; i < str1.length(); i++)
			 (ctr[str1.charAt(i)]) ++;

		 int ctr_first = 0, ctr_second = 0;
		 for (i = 0; i < NOOFCHARS; i++) 
		 {
			 if (ctr[i] > ctr[ctr_first]) 
			 {
				 ctr_second = ctr_first;
				 ctr_first = i;
			 } 
			 else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first])
				 ctr_second = i;
		 }
		 return (char) ctr_second;
	 }
	 
	 public static void main(String args[]) 
	 {
		 String str1 = "successes";
		 System.out.println("The given string is: " + str1);
		 char res = get2ndMostFreq(str1);
	  
		 if (res != '\0')
			 System.out.println("The second most frequent char in the string is: " + res);
		 else
			 System.out.println("No second most frequent character found in the string.");
	 }

}
