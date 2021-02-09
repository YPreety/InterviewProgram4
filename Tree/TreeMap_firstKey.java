package Tree;

import java.util.TreeMap;

/*firstKey() : It returns the first (lowest) key currently in the map.

Syntax : public K firstKey()
Parameters:NA
Return Value:It returns the first (lowest) key currently in this map.
Exception:NA
NoSuchElementException : It is thrown if this map is empty.*/

public class TreeMap_firstKey {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		// assigning the values in the tree map
		// using put()
		treemap.put(2, "two");
		treemap.put(1, "one");
		treemap.put(3, "three");
		treemap.put(6, "six");
		treemap.put(5, "five");
		treemap.put(9, "nine");

		// Use of firstKey()
		System.out.println("Lowest key is: " + treemap.firstKey());

	}

}
