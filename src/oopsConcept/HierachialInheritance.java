package oopsConcept;

//Hierarchial Inheritance : A single super class  can have multiple sub classes or multiple sub classes will be derived from single super class

class Btech
{

	Btech ()
	{
		System.out.println("This is Annamacharya B.tech college");
	}
}

class A extends Btech
{
	A()
	{
		System.out.println("We are students from A section.");
	}
}

class B extends Btech
{
	B()
	{
		System.out.println("We are students from B section.");
	}
}

public class HierachialInheritance
{
	public static void main(String args[])
	{
		//B b= new B();
		A a= new A();
	}
}
