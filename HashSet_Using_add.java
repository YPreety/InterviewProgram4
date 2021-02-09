package Programming;

import java.util.HashSet;
import java.util.Set;

//Create a set and using .add() method we add the elements into the set
public class HashSet_Using_add {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);

		set.add(3);
		System.out.println(set); // [1, 2, 3, 4, 5, 6, 7, 8]

	}

}
