package Programming;

import java.util.HashMap;

/*Check if an array can be divided into pairs whose sum is divisible by k
Given an array of integers and a number k, write a function that returns true if given array can be divided 
into pairs such that sum of every pair is divisible by k.

Input: arr[] = {9, 7, 5, 3}, 
k = 6
Output: True
We can divide array into (9, 3) and
(7, 5). Sum of both of these pairs 
is a multiple of 6.

Input: arr[] = {92, 75, 65, 48, 45, 35}, 
k = 10
Output: True
We can divide array into (92, 48), (75, 65) 
and (45, 35). Sum of all these pairs is a
multiple of 10.

Input: arr[] = {91, 74, 66, 48}, k = 10
Output: False*/

public class Array_Can_Be_Divided_Into_Pairs {

	public static void main(String[] args) {
		int arr[] = { 92, 75, 65, 48, 45, 35 };
		int k = 10;
		boolean ans = canPairs(arr, k);
		if (ans)
			System.out.println("True");
		else
			System.out.println("False");
	}

	static boolean canPairs(int ar[], int k) {
		if (ar.length % 2 == 1)
			return false;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			int rem = ar[i] % k;
			if (!hm.containsKey(rem)) {
				hm.put(rem, 0);
			}
			hm.put(rem, hm.get(rem) + 1);
		}
		for (int i = 0; i < ar.length; i++) {
			int rem = ar[i] % k;
			if (2 * rem == k) {
				if (hm.get(rem) % 2 == 1)
					return false;
			}
			else if (rem == 0) {
				if (hm.get(rem) % 2 == 1)
					return false;
			}
			else {
				if (hm.get(k - rem) != hm.get(rem))
					return false;
			}
		}
		return true;
	}

}
