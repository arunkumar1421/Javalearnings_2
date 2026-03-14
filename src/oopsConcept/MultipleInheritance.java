package oopsConcept;

/*Multiple inheritance : A single sub class will be derived from multiple super classes
Basically Java does not support multiple inheritances with classes. In java we achieve multiple inheritance 
through interface concept means a single class implementing multiple interface. */

/*Reason: we can't extend multiple class at same time because of ambiguity problem every class may have duplicate methods 
eventhough if we haven't created a duplicate methods in class but in java every class by default will be having 
some duplicate methods which are extended from object class because object class is the root class for every class in java.*/

interface Animal2
{
	
	void setName(String name);
	public static void display()
	{
		System.out.println("Name of this animal ");
	}
}

interface Elephant
{
	void setColor(String color);
	
}
class Mulimpl implements Animal2,Elephant
{
	String name;
	String color;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public void display()
	{
		System.out.println("Animal name: "+name+" color :"+color);
	}
}

public class MultipleInheritance 
{
	public static void main(String args[])
	{
		Mulimpl m= new Mulimpl();
		m.setName("Elephant");
		m.setColor("White");
		m.display();
	}
	
}
