package Design_Patterns;

import java.util.TreeMap;

public class largest_Valued {

	public static void main(String[] args) {
		TreeMap<Integer, String> que = new TreeMap<Integer, String>();

		// assigning the values in que
		// using put()
		que.put(10, "astha");
		que.put(4, "shambhavi");
		que.put(7, "manjeet");
		que.put(8, "nikhil");

		String prio = "high";

		System.out.println("The initial queue is : " + que);
		if (prio == "high") {
			System.out.println("The largest valued person is : " + que.pollLastEntry());
			System.out.println("The resultant queue after deletion is : " + que);
		} else {
			System.out.println("The lowest valued person is : " + que.pollFirstEntry());
			System.out.println("The resultant queue after deletion is : " + que);
		}

	}

}
