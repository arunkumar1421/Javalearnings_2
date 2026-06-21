package oopsConcept;

/*to declare any variable value is same across different objects
 * all objects can single variable
 *  we use static methods 
 * Static methods can access static stuff directly without object
static methods can access non-static methods through object
Non-static methods can access everything
Ststic methods cant access non static variables/ methods
static methods can static stuff through class name.*/
public class StaticKeyword {
	
	int emp_id;
	static int  dept_no;
	String emp_name;
	
	public void display()
	{
		System.out.println("employee name :"+ emp_name+" and empployee dept no :"+dept_no+" employeed id: "+emp_id);
		
	}

	
	/*
	 * static int a=10; // static variable 
	 int b=20;
	 * static void m1() { 
	        System.out.println(a);
	 * System.out.println("this is static method."); 
	 //System.out.println(b); //static methods can't access non static properties
	 }*/
	
	public static void main(String args[])
	{
		dept_no=2;
		
		StaticKeyword s= new StaticKeyword();
		s.emp_id=1;
		s.emp_name= "Arun";
		
		StaticKeyword s1= new StaticKeyword();
		s1.emp_id=2;
		s1.emp_name="Swapnali";
		s.display();
		s1.display();
	}

}
