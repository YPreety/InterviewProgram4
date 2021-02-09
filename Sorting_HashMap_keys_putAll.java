package Programming;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*Input : Key = Jayant, Value = 80
Key = Anushka, Value = 80
Key = Amit, Value = 75
Key = Abhishek, Value = 90
Key = Danish, Value = 40
Output : Sorted Map according to Names:
 Key = Abhishek, Value = 90
 Key = Amit, Value = 75
 Key = Anushka, Value = 80
 Key = Danish, Value = 40
 Key = Jayant, Value = 80*/

public class Sorting_HashMap_keys_putAll {

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
		TreeMap<String, Integer> sorted = new TreeMap<>();
		sorted.putAll(map);
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
}
