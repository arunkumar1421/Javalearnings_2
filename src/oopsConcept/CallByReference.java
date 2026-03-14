package oopsConcept;

public class CallByReference {
	int a;
	public void sum(CallByReference c)
	{
		a=a+1;
		System.out.println("Sum of numbers: "+ a);
	}

	public static void main(String[] args) {
		CallByReference r= new CallByReference();
		r.a=10;
		System.out.println("numbers before calling method: "+ r.a );
		r.sum(r);
		System.out.println("numbers after calling method: "+ r.a );
	}

}
