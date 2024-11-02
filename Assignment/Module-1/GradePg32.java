package Assignment0407;

import java.util.Scanner;

public class GradePg32
{

static String grade(int a )
{
    if (a>=91 && a<=100)
    {
    	return "GRADE = A" ;
    }
    if (a>=81 && a<=90)
    {
    return "GRADE = B";
    }
    if (a>=71 && a<=80) 
    {
    	return "GRADE = B";
    }
    if (a>=61 && a<=70)
    {
        return "GRADE = C";
    }
    if (a>=51 && a<=60) 
    {
    return "GRADE = D";
	}
    if (a>=41 && a<=50)
    {
        return "GRADE = DD ";
    }
    if (a<=40) 
    {
    return "FAIL";
    }
    else
    {
	 return "please enter valid number ";
	 
	}
}
//{
//	static void grade(int a)
//	{
//		if (a>91 && a<100)
//		{
//			System.out.println("AA");
//		}
//		//return a;
//		
//		
//	}
//	
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//	    //void ans = grade(a);
//		System.out.println(a);
//	}
//	
//
//}
    public static void main(String[] args) 
    {
    	System.out.println("Please Enter the Marks :");
       Scanner in = new Scanner(System.in) ;
       int a = in.nextInt();
      String ans = grade(a) ;
      System.out.println(ans) ;
//        
//        
//    }
//    static String grade(int a ) {
//        if (a>91 && a<100) {
//       return "AA" ;
//        }
//    if (a>81 && a<90){
//        return "AB";
//    }
//    if (a>71 && a<80) {
//        return "BB";
//    }
//        if (a>61 && a<70){
//            return "BC";
//        }
//    if (a>51 && a<60) {
//        return "CD ";
//    }
//        if (a>41 && a<50){
//            return "DD ";
//        }
//    if (a<=40) {
//        return "FAIL";
//    }
//     else   return "please enter valid number ";
//    	}
   }}
