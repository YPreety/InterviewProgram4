package Programming;

import java.util.HashMap;
import java.util.Map;

/*Sum of f(a[i], a[j]) over all pairs in an array of n integers
Input : 6 6 4 4 
Output : -8 
Explanation: 
All pairs are: (6 - 6) + (6 - 6) +
(6 - 6) + (4 - 6) + (4 - 6) + (4 - 6) + 
(4 - 6) + (4 - 4) + (4 - 4) = -8

Input: 1 2 3 1 3
Output: 4 
Explanation: the pairs that add up are:
(3, 1), (3, 1) to give 4, rest all pairs 
according to condition gives 0. 

Time Complexity : O(n)*/

public class SumofOverAllPairs {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 1, 3 };
		int n = a.length;
		System.out.println(sum(a, n));
	}

	public static int sum(int a[], int n) {
		Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
		int ans = 0, pre_sum = 0;
		for (int i = 0; i < n; i++) {
			ans += (i * a[i]) - pre_sum;
			pre_sum += a[i];
			if (cnt.containsKey(a[i] - 1))
				ans -= cnt.get(a[i] - 1);
			if (cnt.containsKey(a[i] + 1))
				ans += cnt.get(a[i] + 1);
			if (cnt.containsKey(a[i])) {
				cnt.put(a[i], cnt.get(a[i]) + 1);
			} else {
				cnt.put(a[i], 1);
			}
		}
		return ans;
	}
}
