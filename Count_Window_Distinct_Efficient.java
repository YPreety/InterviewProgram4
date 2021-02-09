package Programming;

import java.util.HashMap;

//Time complexity is O(n).

public class Count_Window_Distinct_Efficient {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
		int k = 4;
		countDistinct(arr, k);
	}

	static void countDistinct(int arr[], int k) {
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
		int dist_count = 0;
		for (int i = 0; i < k; i++) {
			if (hM.get(arr[i]) == null) {
				hM.put(arr[i], 1);
				dist_count++;
			} else {
				int count = hM.get(arr[i]);
				hM.put(arr[i], count + 1);
			}
		}
		System.out.println(dist_count);
		for (int i = k; i < arr.length; i++) {
			if (hM.get(arr[i - k]) == 1) {
				hM.remove(arr[i - k]);
				dist_count--;
			} else {
				int count = hM.get(arr[i - k]);
				hM.put(arr[i - k], count - 1);
			}
			if (hM.get(arr[i]) == null) {
				hM.put(arr[i], 1);
				dist_count++;
			} else {
				int count = hM.get(arr[i]);
				hM.put(arr[i], count + 1);
			}
			System.out.println(dist_count);
		}
	}
}
