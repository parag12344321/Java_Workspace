package Assignment0407;

class ExtedingThreadPg43 extends Thread
	{  
		public void run()
		{  
			System.out.println("Now Thread is running...");  
		}
	  
		public static void main(String[] args) 
		{
			ExtedingThreadPg43 t1=new ExtedingThreadPg43();
				
			t1.start();  
		 }  
	}


