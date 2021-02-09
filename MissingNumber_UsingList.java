package Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber_UsingList {

	public static void main(String[] args) {
		int arr[] = { 13, 12, 11, 15 };
		int n = arr.length;
		System.out.println(missingNum(arr, n));
	}

	static int missingNum(int arr[], int n) {
		List<Integer> list = new ArrayList<>(arr.length);
		for (int i : arr) {
			list.add(Integer.valueOf(i));
		}
		int minvalue = Collections.min(list);
		;
		int xornum = 0;
		for (int i = 0; i < n; i++) {
			xornum ^= (minvalue) ^ arr[i];
			minvalue++;
		}
		return xornum ^ minvalue;
	}
}
