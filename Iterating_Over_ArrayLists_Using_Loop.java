package Programming;

import java.util.Arrays;
import java.util.List;

public class Iterating_Over_ArrayLists_Using_Loop {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		// For Loop for iterating ArrayList
		for (int i = 0; i < numbers.size(); i++)
			System.out.print(numbers.get(i) + " ");

	}

}
