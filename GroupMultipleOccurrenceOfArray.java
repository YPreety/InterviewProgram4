package Programming;

import java.util.HashMap;

/*Group multiple occurrence of array elements ordered by first occurrence
Given an unsorted array with repetitions, the task is to group multiple occurrence of individual elements. 
The grouping should happen in a way that the order of first occurrences of all elements is maintained.

Input: arr[] = {5, 3, 5, 1, 3, 3}
Output:        {5, 5, 3, 3, 3, 1}

Input: arr[] = {4, 6, 9, 2, 3, 4, 9, 6, 10, 4}
Output:        {4, 4, 4, 6, 6, 9, 9, 2, 3, 10}

Time Complexity is Θ(n)*/

public class GroupMultipleOccurrenceOfArray {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 10, 10, 4, 1, 3 };
		orderedGroup(arr);

	}

	static void orderedGroup(int arr[]) {

		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			Integer prevCount = hM.get(arr[i]);
			if (prevCount == null)
				prevCount = 0;

			hM.put(arr[i], prevCount + 1);
		}

		for (int i = 0; i < arr.length; i++) {

			Integer count = hM.get(arr[i]);
			if (count != null) {

				for (int j = 0; j < count; j++)
					System.out.print(arr[i] + " ");

				hM.remove(arr[i]);
			}
		}
	}

}
