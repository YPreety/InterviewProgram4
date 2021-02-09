package Tree;

import java.util.TreeMap;

/*put() : It associates the specified value with the specified key in the map. If a key is already present, then updating it 
results in updation of that key.

Parameters:
key : The key with which the value is to be associated.
value : The value to be associated with the given key.
Return Value:
It returns the previously associated value with this key,
or null if there was no mapping for key.
Exception: 
Not Available.*/

public class TreeMap_put {

	public static void main(String[] args) {
		TreeMap<String, Integer> tmp = new TreeMap<String, Integer>();
        tmp.put("one", 1);
        tmp.put("two", 3);
        System.out.println("The initial TreeMap is : " + tmp);
 
        // Putting value at key two
        // replaces the previous value if present
        int z = tmp.put("two", 2);
 
        // checking the previous value associated with "two"
        System.out.println("The previous value with two is : " + z);
 
        // prints the complete map
        System.out.println("Updated TreeMap is : " + tmp);

	}

}
