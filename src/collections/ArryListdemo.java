package collections;

import java.util.ArrayList;
import java.util.Iterator;

/*//Arraylist is class which is implementeing the List collection interface and 
 * which stores both heterogeneous and homogeneous data , 
allows to store duplicate values and multiple null values 
moreover it preseverd the insertion order of elements*/


public class ArryListdemo {

	public static void main(String[] args) {
		
		ArrayList<Object>  mylist = new ArrayList <Object>();
		
		// adding elements to list
		mylist.add("arun");
		mylist.add(2);
		mylist.add("kumar");
		
		System.out.println(" Array list elements :"+ mylist);
		
		System.out.println("Size of an array list : "+ mylist.size());
		
		mylist.remove(2);
		System.out.println("After removing: "+ mylist);
		
		mylist.add(2, "Java");
		mylist.add(1, "Selenium");
		mylist.add(null);
		mylist.add(null);
		System.out.println("After adding element"+ mylist);
		
		// replcing the value in list
		mylist.set(4, "Kumar");
		
		// removing multiple elements from arraylist using removeAll() function
		
		/*
		 * List <Object> mylist2= new ArrayList(); mylist2.add("Selenium");
		 * mylist2.add("Java"); System.out.println(" Array list elements :"+ mylist2);
		 * 
		 * mylist.removeAll(mylist2);
		 */
		
		System.out.println("Removing elements from mylist :"+ mylist);
		
		// reading elements from array list one by one using for loop
		
		for (int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
		
		// using enhanced loop
		
		for(Object x: mylist)
		{
			System.out.println(x);
		}
		
		// Using Iterator concept which is mainly designed for collection usage
		
		Iterator it= mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// clearing all elemnts from list
		
		mylist.clear();
		
		System.out.println("is mylis is empty? "+ mylist.isEmpty());
		
		

	}

}
