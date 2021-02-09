package Tree;

import java.util.TreeMap;

/*containsValue(Object o) : It returns true if this map maps one or more keys to the specified value.

Parameters: o : This is the value whose presence in this map is to be tested.
Return Value: Returns true if a mapping to this value exists else false.
Exception: NA*/

public class TreeMap_containsValue {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

        treemap.put(2, "two");
        treemap.put(7, "seven");
        treemap.put(3, "three");
        treemap.put(6, "six");
        treemap.put(9, "nine");

        System.out.println(treemap.containsValue("six"));
        System.out.println(treemap.containsValue("four"));

	}

}
