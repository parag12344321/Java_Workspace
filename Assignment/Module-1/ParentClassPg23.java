package Assignment0407;

class ParentClass
{
	void  PrintParentClass()
	{
		System.out.println("This is a parent class");
	}
}
	
class ChildClass extends ParentClass
{
	void PrintChildClass()
	{
		System.out.println("This is a child class");
	}
}
public class ParentClassPg23
{
	
    public static void main(String[] args)
    {
    	//Object of parent class
		ParentClass pc = new ParentClass();
		//call method of parent class
		pc.PrintParentClass();
		//object of child class
		ChildClass cc = new ChildClass();
		//call method of child class
		cc.PrintChildClass();
		//call method of parent class by object of child class
		cc.PrintParentClass();
	}
}

