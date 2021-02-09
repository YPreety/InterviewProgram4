package Tree;

import java.util.TreeMap;

/*pollFirstEntry():It removes and retrieves a key-value pair with the least key value in the map and “null” is map is empty.

Syntax : 
public Map.Entry pollFirstEntry()
Parameters: NA
Return Value: Retrieves and removes the least key-value if map is filled else returns null.
Exception: NA*/

public class TreeMap_pollFirstEntry {

	public static void main(String[] args) {
		TreeMap<String, Integer> tmp = new TreeMap<String, Integer>();
		System.out.println("The smallest key value pair is : " + tmp.pollFirstEntry());  //null
		tmp.put("Geeks", 1);
		tmp.put("for", 4);
		tmp.put("geeks", 1);
		System.out.println("The initial Map before deletion is : " + tmp);  //{Geeks=1, for=4, geeks=1}
		System.out.println("The smallest key value pair is : " + tmp.pollFirstEntry());  //Geeks=1
		System.out.println("The resultant Map after deletion is : " + tmp);  //{for=4, geeks=1}

	}

}
