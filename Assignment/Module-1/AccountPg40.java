package Assignment0407;

public class AccountPg40 
{
	public void withdraw(int amount) throws InsufficientBalanceExceptionPg40
	{
		if(amount>2000)
			throw new InsufficientBalanceExceptionPg40();
		System.out.println(amount +"withdrawn successfully");
	}
	public static void main(String[] args) 
	{
		AccountPg40 ac = new AccountPg40();
		try 
		{
			ac.withdraw(2500);
		} 
		catch (InsufficientBalanceExceptionPg40 e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}

