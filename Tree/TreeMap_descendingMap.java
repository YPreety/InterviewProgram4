package Tree;

import java.util.NavigableMap;
import java.util.TreeMap;

/*descendingMap() : It returns a reverse order view of the mappings contained in the map.
Syntax :public NavigableMap descendingMap()
Parameters:NA
Return Value :It returns a reverse order view of the map.
Exception:NA*/

public class TreeMap_descendingMap {

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
 
        // putting values in navigable map
        // use of descendingMap()
        NavigableMap map1 = treemap.descendingMap();
 
        System.out.println("Navigable map values are: " + map1);

	}

}
