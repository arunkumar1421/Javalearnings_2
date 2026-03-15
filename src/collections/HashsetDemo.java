package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*Hashset is a one of the collection concept
it is a class which implements a set collection interface
and which allows to store both heterogeneous and homogeneous data
insertion order of elements is not preseved in the set collection
duplicate elements are not allowed additionally it not allows to store multiple null values but it store single null value
*/
/*
 * drawback 1. removing multiples elements not allowed 2. Accesing specific
 * element and adding or inserting elemnts into specific placement in set is not supported because set
 * doesn't support insertion concept
 * 
 */
public class HashsetDemo {

	public static void main(String[] args) {
		HashSet <Object> set1= new HashSet <Object>();
		
		set1.add("Arun");
		set1.add("Kumar");
		set1.add("C");
		set1.add(12);
		set1.add(true);
		set1.add(null);
		set1.add(12);
		set1.add(null);
		
		System.out.println("set of elements from set1 :"+ set1);
		
		System.out.println("Size of a set1: "+ set1.size());
		
		// removing elemnts from set
		
		set1.remove(12);
		System.out.println("set of elements from set1 after removing :"+ set1);
		System.out.println("Size of a set1: "+ set1.size());
		
		// directly we can't access element from set but indirectly we can do that by converting set into list
		
		ArrayList <Object> list= new ArrayList(set1);
		
		System.out.println("list of ekements : "+ list);
		
		System.out.println(list.get(2));
		
		// reading elemnts from set normal for loop not supported due to insertion doesn't in set
		
		for(Object x: set1)
		{
			System.out.println(x);
		}
		
		Iterator <Object> it= set1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
