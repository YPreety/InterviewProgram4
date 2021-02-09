package Programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*In this method first we create an array then convert it to a list and then pass it to the HashSet constructor that 
accepts another collection.*/

public class HashSet_Using_Constructor {

	public static void main(String[] args) {
		Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 };

		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		System.out.println(set); // [1, 2, 3, 4, 5, 6, 7, 8]
	}
}
