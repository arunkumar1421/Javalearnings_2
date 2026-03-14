package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap hm= new HashMap();
		
		hm.put(1, "Arun");
		hm.put(2, "kumar");
		hm.put(3, 34567890);
		hm.put(4, null);
		
		System.out.println("Elements in HashMap: "+ hm);
		
		System.out.println("Size of an hashmap: "+ hm.size());
		
		System.out.println("Keys in the map :"+ hm.keySet());
		
		System.out.println("Vlaues in the map: "+hm.values());
		
		System.out.println("fetcheing both key and value pairs: "+ hm.entrySet());
		
	// removing elements from hashmap
		hm.remove(2);
		System.out.println("Elements in HashMap: "+ hm);
		// fetching specific values through key
		System.out.println(hm.get(1));
		hm.put(2, "kumar");
		System.out.println("Elements in HashMap: "+ hm);
		// reading elements from map using enhance for loop
		
		for(Object x: hm.keySet())
		{
			System.out.println(hm.get(x));
		}
		
		Iterator it=  hm.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// if you change the value of specifi elemnt add it again it overirde the older value
		hm.put(4, "HashMap");
		System.out.println("Elements in HashMap: "+ hm);
		hm.put(4, "HashMap collection");
		System.out.println("Elements in HashMap: "+ hm);
		
		
		

	}

}
