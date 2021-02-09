package Tree;

import java.util.TreeMap;

/*ceilingKey(K key) : This has also the same work as that of the upper one but the only difference is that it does not 
contains the mapped-keys.It simply returns the least key greater or equal to the given key, else returns NULL.

Syntax : public K ceilingKey(K key)
Parameters :key : The key to be matched.
Return Value : It returns the entry with the least key greater than or equal to key, and null if there is no such key.
Exception:
ClassCastException : It throws the exception if the specified key cannot be compared with the keys currently in the map.
NullPointerException : It throws the exception if the specified key is null. */

public class TreeMap_ceilingKey {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		// assigning the values in the tree map
		// using put()
		treemap.put(2, "two");
		treemap.put(7, "seven");
		treemap.put(3, "three");

		// Use of ceilingKey()
		// returns 7 ( next greater key)
		System.out.println("The next greater key of 5 is : " + treemap.ceilingKey(5));

		// returns "null" as no key present
		// greater than or equal to number
		System.out.println("The next greater key of 8 is : " + treemap.ceilingKey(8));

	}

}
