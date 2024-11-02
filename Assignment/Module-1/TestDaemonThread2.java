package Assignment0407;

public class TestDaemonThread2 extends Thread
{
	
	public void run()
	{  
		  if(Thread.currentThread().isDaemon())
		  {
			  //checking for daemon thread  
			  System.out.println("Daemon Thread executing");  
		  }  
		  else
		  {  
			  System.out.println("User thread excuting");  
		  }  
		 }  
	
	public static void main(String[] args)
	{
		TestDaemonThread2 t1=new TestDaemonThread2(); 
		TestDaemonThread2 t2=new TestDaemonThread2(); 
		
		
		t1.start(); 
		t1.setDaemon(true);//will throw exception here
		t2.start();
	}

}
