package Tree;

import java.util.TreeMap;

/*floorKey() : It returns the greatest key less than or equal to the given key, or null if there is no such key.

Parameters:
key : This is the key to be matched.
Return Value:
It returns an entry with the greatest key less than or equal to key, or
null if there is no such key.
Exception:
ClassCastException : This exception is thrown if the specified
key cannot be compared with the keys currently in the map.
NullPointerException : This exception is thrown if the specified key
is null and this map uses natural ordering, or its comparator does not permit null keys.*/

public class TreeMap_floorKey {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmp = new TreeMap<Integer, String>();
        tmp.put(10, "ten");
        tmp.put(7, "seven");
        tmp.put(19, "nineteen");
        tmp.put(3, "three");
 
        // use of floorKey()
        // displays the floor key of
        // prints 3
        System.out.println("The greatest key less than 6 is : "
        + tmp.floorKey(6));

	}

}
