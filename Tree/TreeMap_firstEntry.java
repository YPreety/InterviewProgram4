package Tree;

import java.util.TreeMap;

/*firstEntry() : It returns a key-value mapping associated with the least key in this map, or null if the map is empty.

Syntax : public Map.Entry firstEntry()
Parameters: NA
Return Value: It returns an entry with the least key and null if the map is empty.
Exception: NA*/

public class TreeMap_firstEntry {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		// assigning the values in the tree map
		// using put()
		treemap.put(2, "two");
		treemap.put(7, "seven");
		treemap.put(3, "three");
		treemap.put(1, "one");
		treemap.put(6, "six");
		treemap.put(9, "nine");

		// use of firstEntry()
		System.out.println("Lowest entry is: " + treemap.firstEntry());

	}

}
