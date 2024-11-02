package Assignment0407;

class ThreadRunnable implements Runnable
{
	public void run() 
	{
		System.out.println("I am a Thread");
	}
}

public class ThreadPg42 
{
	
	public static void main(String[] args)
	{
		ThreadRunnable th = new ThreadRunnable();
		Thread t1 = new Thread(th);
		
		t1.start();
	}
	

}
