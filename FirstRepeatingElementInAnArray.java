package Programming;

import java.util.HashSet;

/*Input:  arr[] = {10, 5, 3, 4, 3, 5, 6}
Output: 5 [5 is the first element that repeats]

Input:  arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
Output: 6 [6 is the first element that repeats]*/

//Time Complexity of this solution is O(n)

public class FirstRepeatingElementInAnArray {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		printFirstRepeating(arr);

	}

	static void printFirstRepeating(int arr[]) {

		int min = -1;

		HashSet<Integer> set = new HashSet<>();

		for (int i = arr.length - 1; i >= 0; i--) {

			if (set.contains(arr[i]))
				min = i;

			else 
				set.add(arr[i]);
		}

		if (min != -1)
			System.out.println("The first repeating element is " + arr[min]);
		else
			System.out.println("There are no repeating elements");
	}
}
