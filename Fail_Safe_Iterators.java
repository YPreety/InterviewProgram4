package Programming;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*Fail-Safe iterators don’t throw any exceptions if a collection is structurally modified while iterating over it. 
This is because, they operate on the clone of the collection, not on the original collection and that’s why they are called 
fail-safe iterators. Iterator on CopyOnWriteArrayList, ConcurrentHashMap classes*/

public class Fail_Safe_Iterators {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + map.get(key));
			map.put("SEVEN", 7);

		}
	}

}
