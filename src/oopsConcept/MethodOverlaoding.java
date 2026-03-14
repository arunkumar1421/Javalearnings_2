package oopsConcept;

public class MethodOverlaoding {
	int a; int b;
	void add()
	{
		System.out.println("Addintion of numbers: "+ (a+b));
	}
	
	void add(int a, int b)
	{
		System.out.println("Addintion of two numbers: "+ (a+b));
	}
	void add(int a, int b,int c)
	{
		System.out.println("Addintion of three numbers: "+ (a+b));
	}

	

}
