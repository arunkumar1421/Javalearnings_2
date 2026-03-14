package oopsConcept;

public class Student {
	
	String name;
	String address;
	long phno;
	Student()
	{
		name=name;
		address=address;
		phno=phno;
	}
	
	Student (String n,String a,long c)
	{
		name=n;
		address=a;
		phno=c;
	}
	
	void display()
	{
		System.out.println("Student "+name+ " and Address: "+address+ " phone number is "+phno);
	}

}
