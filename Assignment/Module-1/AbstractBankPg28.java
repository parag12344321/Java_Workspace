package Assignment0407;

abstract class Bank
{
	abstract void getBalance();	
}

class BankA extends Bank
{
	void getBalance()
	{
		System.out.println("BankA Balance = $100");
	}
}
class BankB extends Bank
{
	void getBalance()
	{
		System.out.println("BankB Balance = $200");
	}
}
class BankC extends Bank
{
	void getBalance()
	{
		System.out.println("BankC Balance = $300");
	}
}

public class AbstractBankPg28 
{
	
	public static void main(String[] args) 
	{
		
		Bank obj1 = new BankA();
		Bank obj2 = new BankB();
		Bank obj3 = new BankC();
		
		obj1.getBalance();
		obj2.getBalance();
		obj3.getBalance();
		
	}

}
