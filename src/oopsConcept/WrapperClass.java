package oopsConcept;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * int a=10; double d=10.23; char c='a'; boolean b= true;
		 * 
		 * 
		 * //auto boxing -- converting primitive data types to object Integer i= a;
		 * Double b1 =d; Character e= c;
		 * 
		 * Boolean bool = b; System.out.println("Auto boxing.....");
		 * System.out.println(i); System.out.println(b1); System.out.println(e);
		 * System.out.println(bool);
		 * 
		 * //Unboxing -- Converting object data type into primitive type
		 * 
		 * int z=i; double de=b1; char ch=e; boolean cool=bool;
		 * 
		 * System.out.println("Unboxing....."); System.out.println(z);
		 * System.out.println(de); System.out.println(ch); System.out.println(cool);
		 */
		
		/*
		 * Wrapper class gives us some utility methods to perform data
		 * conversion,comparing values and parsing data conversion happens in two ways
		 * 1. from String to all types expect character 2. from all types to String
		 Data conversion
		 */
		
		/*String s= "1234";
		String s1= "true";
		int in= Integer.parseInt(s);
		double n= Double.parseDouble(s);
		boolean to= Boolean.parseBoolean(s1);
		//char c we can't convert string to convert because chat can store single char where as String is collection of characters
		System.out.println(in);
		System.out.println(n);
		System.out.println(to);*/
		
		int i= 100;
		double d= 23.09;
		char c= 'a';
		boolean b= false;
		
		String s2= Integer.toString(i); Integer in= Integer.valueOf(i);
		String s3= String.valueOf(i);
		String s4= String.valueOf(d);
		String s5= String.valueOf(b);
		String s6=String.valueOf(c);
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		
		

	}

}
