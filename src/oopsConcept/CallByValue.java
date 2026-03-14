package oopsConcept;

public class CallByValue {
	int a;

	
	  public void callbyValue1(int a) { a=a+1; System.out.println("Numbers: "+ a);
	  }
	 
	
	
	public static void main(String args[])
	{
		CallByValue c= new CallByValue();
		int a=2;
		System.out.println("numbers before calling method: "+ a );
		c.callbyValue1(a);
		System.out.println("numbers afetr calling method: "+ a );
		
	}

}
