package Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*Collections class consists of several methods that operate on collections.
a) Collection.addAll() : adds all the specified elements to the specified collection of the specified type.
b) Collections.unmodifiableSet() : adds the elements and returns an unmodifiable view of the specified set.*/

public class HashSet_Using_Collections {

	public static void main(String[] args) {
		Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 };

		Set<Integer> set = Collections.<Integer>emptySet();
		Collections.addAll(set = new HashSet<Integer>(Arrays.asList(arr)));

		Set<Integer> set2 = Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(arr)));

		System.out.println(set); // [1, 2, 3, 4, 5, 6, 7, 8]

	}

}
