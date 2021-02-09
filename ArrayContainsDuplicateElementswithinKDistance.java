package Programming;

import java.util.HashSet;

/*Check if a given array contains duplicate elements within k distance from each other
Given an unsorted array that may contain duplicates. Also given a number k which is smaller than size of array. 
Write a function that returns true if array contains duplicates within k distance.

Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
Output: false
All duplicates are more than k distance away.

Input: k = 3, arr[] = {1, 2, 3, 1, 4, 5}
Output: true
1 is repeated at distance 3.

Input: k = 3, arr[] = {1, 2, 3, 4, 5}
Output: false

Input: k = 3, arr[] = {1, 2, 3, 4, 4}
Output: true

time complexity Θ(n)*/

public class ArrayContainsDuplicateElementswithinKDistance {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		if (checkDuplicatesWithinK(arr, 3))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	static boolean checkDuplicatesWithinK(int arr[], int k) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i]))
				return true;
			set.add(arr[i]);
			if (i >= k)
				set.remove(arr[i - k]);
		}
		return false;
	}
}
