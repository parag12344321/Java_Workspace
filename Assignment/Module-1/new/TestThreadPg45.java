package Assignment0407;

class TestThreadTwice1 extends Thread
{
	public void start() 
	{
		System.out.println("This is Thread Starting...");  
		// TODO Auto-generated method stub

	}
}

public class TestThreadPg45 
{	
	public static void main(String[] args) 
	{
		TestThreadTwice1 t1 = new TestThreadTwice1();
		
		
		t1.start ();
		t1.start ();
		
		
	}

	
}
