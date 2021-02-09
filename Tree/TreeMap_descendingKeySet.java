package Tree;

import java.util.NavigableSet;
import java.util.TreeMap;

/*descendingKeySet(): It returns a reverse order Navigable Set view of the keys contained in the map.

Syntax : public NavigableSet descendingKeySet()
Parameters:NA
Return Value:It returns a reverse order navigable set view of the keys in this map.
Exception:NA*/

public class TreeMap_descendingKeySet {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		// assigning the values in the tree map
		// using put()
		treemap.put(2, "two");
		treemap.put(0, "zero");
		treemap.put(3, "three");
		treemap.put(6, "six");
		treemap.put(9, "nine");
		treemap.put(7, "seven");

		// putting values in navigable set
		// use of descendingKeySet
		NavigableSet set1 = treemap.descendingKeySet();

		System.out.println("Navigable set values are: " + set1);

	}

}
