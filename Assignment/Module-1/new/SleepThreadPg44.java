package Assignment0407;

class Thread_Second
		{
			public void start() 
			{
				System.out.println("This is Second Thread running...");  
				// TODO Auto-generated method stub
		
			}
		}

class SleepThreadPg44 extends Thread
	{
	
	
		public static void main(String[] args) 
			{
		
			try 
			{
            System.out.println("Sleep starts");
            Thread.sleep(2000);
            System.out.println("Sleep ends");
			} 
			catch (Exception e)
			{
            e.printStackTrace();
			}
			Thread_Second t1 = new Thread_Second();
			t1.start();
}}
