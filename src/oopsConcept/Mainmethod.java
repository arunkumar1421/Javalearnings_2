package oopsConcept;

public class Mainmethod {

	public static void main(String[] args) {
		//MethodOverlaoding m= new MethodOverlaoding();
		//int a=2;int b=3;
		/*
		 * m.a=2;m.b=3; m.add();
		 * 
		 * m.add(10,10);
		 * 
		 * m.add(2, 3, 4);
		 */
		/*
		 * Student s= new Student(); s.name="Arun"; s.address="Guntakal"; s.phno=
		 * 9876532345l; s.display();
		 * 
		 * Student s1= new Student("Anil","nandyal",987656787l); s1.display();
		 * s1.address="rajamandri"; s1.display();
		 */
		
		
			Encapsulation e= new Encapsulation();
			e.setName("Arun");
			String sname=e.getName();
			e.setSid(1);
			int id=e.getSid();
			e.display();
			
	}

}
