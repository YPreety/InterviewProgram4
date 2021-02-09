package Tree;

import java.util.TreeMap;

/*containskey(Object o) : It returns true if the map contains a mapping for the specified key.

Parameters:o : The key which will be tested whether present or not.
Return Value: Returns true if there is a mapping for the given key.
Exception: 
ClassCastException : This is thrown if the given key cannot be compared with the keys currently in the map.
NullPointerException : This is thrown if the specified key is null.*/

public class TreeMap_containskey {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		treemap.put(2, "two");
		treemap.put(7, "seven");
		treemap.put(3, "three");
		treemap.put(6, "six");
		treemap.put(9, "nine");

		System.out.println(treemap.containsKey(6));
		System.out.println(treemap.containsKey(4));

	}

}
