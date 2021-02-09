package Programming;

import java.util.HashMap;
import java.util.Map;

/*Input : int[] arr = { 11, 11, 11, 23, 11, 37, 51, 
        37, 37, 51, 51, 51, 51 };
k = 2
Output : 37, 51
Explanation :
11's count is 4, 23 count 1, 37 count 3, 51 count 5. 
37 and 51 are two number that appear prime number of
time and frequencies greater than or equal to k.

Input : int[] arr = { 11, 22, 33 } min Occurrence = 1
Output : -1
None of the count is prime number of times*/

public class Numberswithprimefrequencies {

	public static void main(String[] args) {
		int[] arr = { 11, 11, 11, 23, 11, 37, 37, 51, 51, 51, 51, 51 };
		int k = 2;
		primeOccurences(arr, k);
	}

	static void primeOccurences(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			int freq;
			if (map.containsKey(val)) {
				freq = map.get(val);
				freq++;
			} else
				freq = 1;
			map.put(val, freq);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			if (isPrime(value) && value >= k)
				System.out.println(entry.getKey());
		}
	}

	private static boolean isPrime(int n) {
		if ((n > 2 && n % 2 == 0) || n == 1)
			return false;
		for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
