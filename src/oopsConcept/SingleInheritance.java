package oopsConcept;

// Single inheritance : A single sub class inherits properties and behaviors from single super class

class Animal
{
	Animal()
	{
		System.out.println("From Animal class ");
	}
}

class Dog extends Animal{
	Dog()
	{
		System.out.println("From Dog class");
	}
}
public class SingleInheritance {

	public static void main(String args[]) {
	//Dog d= new Dog();
		Animal a= new Animal();
}
}
