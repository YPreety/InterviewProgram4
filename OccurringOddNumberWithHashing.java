package Programming;

import java.util.HashMap;

//Time complexity of this solution is O(n)

public class OccurringOddNumberWithHashing {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		int n = arr.length;
		System.out.println(getOddOccurrence(arr, n));
	}

	static int getOddOccurrence(int arr[], int n) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (hmap.containsKey(arr[i])) {
				int val = hmap.get(arr[i]);
				hmap.put(arr[i], val + 1);
			} else
				hmap.put(arr[i], 1);
		}
		for (Integer a : hmap.keySet()) {
			if (hmap.get(a) % 2 != 0)
				return a;
		}
		return -1;
	}
}
