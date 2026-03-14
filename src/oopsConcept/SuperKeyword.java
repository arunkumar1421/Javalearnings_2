package oopsConcept;

class Teacher
{
	String name="Lakshmi Narayan";
	
	void displayName()
	{
		System.out.println("Name: "+name);
	}
	Teacher()
	{
		System.out.println("This is teacher");
	}
}

class Student1 extends Teacher
{
	String name="Arun Kumar";
	
	void displayName()
	{
		System.out.println(name);
		System.out.println(super.name); //we can access parent class variable in sub class using superkeyword
		//super.displayName(); // super key word used to imvoke immediate parent class variable and methods,constructors.
	}
	
	Student1()
	{
		//super(); // invoke parent class constructor without super also like by default it will invoke the parent class constructor at time creation of child class object
		System.out.println("this is student class");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
	        
		Student1 s= new Student1();
		s.displayName();

	}

}
