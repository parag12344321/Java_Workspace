package Assignment0407;

public class MemberPg24 
{
	int datamembers;
	String name;
	int age;
	int phonenumber;
	String address;
	int salary = 25000;
	
	void PrintSalary() 
	{
		
		System.out.println(salary);
		
	}
	

	public static void main(String[] args)
	{
		
		MemberPg24 sl = new MemberPg24();
		sl.PrintSalary();
		
	}
	
}
