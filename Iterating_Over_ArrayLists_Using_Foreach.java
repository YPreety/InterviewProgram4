package Programming;

import java.util.Arrays;
import java.util.List;

public class Iterating_Over_ArrayLists_Using_Foreach {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		// For Each Loop for iterating ArrayList
		for (Integer i : numbers)
			System.out.print(i + " ");

	}

}
