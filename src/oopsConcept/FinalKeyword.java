package oopsConcept;


/*final class Chocolate
{
	final String name="Silk";
	
	void display()
	{
		System.out.println(name);
	}
}

class Dairy_milk extends Chocolate
{
	//String name= error because we can't change the value of final variable & can't override final variables , methods of parent class  in the child class
	//and we cannot extends the final class class declare as final 
	
}*/

class dog
{
	void display()
	{
		System.out.println("This is dog....");
	}
}

final class Cat1 extends dog  // but we can extend parent class using final child class
{
	void display()
	{
		System.out.println("This is Cat....");
		super.display();
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		Cat1 c= new Cat1();
		c.display();

	}

}
