package Assignment0407;

public class InsufficientBalanceExceptionPg40 extends Exception 
{
	
	public InsufficientBalanceExceptionPg40()
	{
		super("Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.");
	}
	
	public InsufficientBalanceExceptionPg40(String message)
	{
		super(message);
	}

}
