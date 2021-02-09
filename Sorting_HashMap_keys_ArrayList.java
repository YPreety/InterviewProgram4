package Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Sorting_HashMap_keys_ArrayList {

	static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		map.put("Jayant", 80);
		map.put("Abhishek", 90);
		map.put("Anushka", 80);
		map.put("Amit", 75);
		map.put("Danish", 40);
		sortbykey();
	}

	public static void sortbykey() {
		ArrayList<String> sortedKeys = new ArrayList<String>(map.keySet());
		Collections.sort(sortedKeys);
		for (String x : sortedKeys)
			System.out.println("Key = " + x + ", Value = " + map.get(x));
	}
}
