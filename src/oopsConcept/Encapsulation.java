package oopsConcept;

/*Wrapping up of all variables and methods in to a single unit is called encapsulation. and we have some rules 
1. all variables should be declared as private
2. and every variable should have getters and setters methods
3. all varaibles shoud access or operate throgh the methods*/

public class Encapsulation {
	private String name;
	private int sid;
	
	public void setName(String name)
	{
		this.name=name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}
	
	public void display()
	{
		System.out.println("Student deatils: "+ name +" "+sid);
	}

	
	
}

