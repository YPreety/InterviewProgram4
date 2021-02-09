package Programming;

import java.util.HashMap;

/*Find four elements a, b, c and d in an array such that a+b = c+d
Given an array of distinct integers, find if there are two pairs (a, b) and (c, d) 
such that a+b = c+d, and a, b, c and d are distinct elements. 
If there are multiple answers, then print any of them.

Input:   {3, 4, 7, 1, 2, 9, 8}
Output:  (3, 8) and (4, 7)
Explanation: 3+8 = 4+7

Input:   {3, 4, 7, 1, 12, 9};
Output:  (4, 12) and (7, 9)
Explanation: 4+12 = 7+9

Input:  {65, 30, 7, 90, 1, 9, 8};
Output:  No pairs found

Time complexity is O(n2 Log n)*/

public class FindPair {

	class pair {
		int first, second;

		pair(int f, int s) {
			first = f;
			second = s;
		}
	};

	public static void main(String[] args) {
		int arr[] = { 3, 4, 7, 1, 2, 9, 8 };
		FindPair a = new FindPair();
		a.findPairs(arr);

	}

	boolean findPairs(int arr[]) {

		HashMap<Integer, pair> map = new HashMap<Integer, pair>();
		int n = arr.length;

		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {

				int sum = arr[i] + arr[j];
				if (!map.containsKey(sum))
					map.put(sum, new pair(i, j));

				else {

					pair p = map.get(sum);

					System.out.println(
							"(" + arr[p.first] + ", " + arr[p.second] + ") and (" + arr[i] + ", " + arr[j] + ")");
					return true;
				}
			}
		}
		return false;
	}

}
