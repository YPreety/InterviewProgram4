package Tree;

import java.util.TreeMap;

/*ceilingEntry(K Key) : It is used to return a key-value mapping associated with the least key greater than or equal to the 
given key, or null if there is no such key.

Syntax : public Map.Entry ceilingEntry(K key)
Parameters : key : The key to be matched.
Return Value : It returns the entry with the least key greater than or equal to key, and null if there is no such key.
Exception : 
ClassCastException : It throws the exception if the specified key cannot be compared with the keys currently in the map.
NullPointerException : It throws the exception if the specified key is null.*/

public class TreeMap_ceilingEntry {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		// assigning the values in the tree map
		// using put()
		treemap.put(2, "two");
		treemap.put(7, "seven");
		treemap.put(3, "three");

		// Use of ceilingEntry()
		// returns 7=seven ( next greater key-value)
		System.out.println("The next greater key-value of 5 is : " + treemap.ceilingEntry(5));

		// returns "null" as no value present
		// greater than or equal to number
		System.out.println("The next greater key-value of 8 is : " + treemap.ceilingEntry(8));

	}

}
