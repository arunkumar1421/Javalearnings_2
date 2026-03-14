package oopsConcept;


class Animal1
{
    String color="white";
    
     void displayColor()
    {
    	System.out.println(color);
    }
}

class Cat extends Animal1
{
	String color="orange";
	 
	void displayColor() {
		System.out.println(color);
		super.displayColor(); 
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
	     
		Cat c= new Cat();
		c.displayColor();
		c.color="Black";
		c.displayColor();
		Animal1 a= new Animal1();
		a.displayColor();
		

	}

}
