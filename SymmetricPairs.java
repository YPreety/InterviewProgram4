package Programming;

import java.util.HashMap;

/*Given an array of pairs, find all symmetric pairs in it
Two pairs (a, b) and (c, d) are said to be symmetric if c is equal to b and a is equal to d.
For example (10, 20) and (20, 10) are symmetric. 
Given an array of pairs find all symmetric pairs in it.

Input: arr[] = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}}
Output: Following pairs have symmetric pairs
        (30, 40)
        (5, 10) 
        
Time Complexity is O(n)*/

public class SymmetricPairs {

	public static void main(String[] args) {
		int arr[][] = new int[5][2];
		arr[0][0] = 11;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 5;
		arr[2][1] = 10;
		arr[3][0] = 40;
		arr[3][1] = 30;
		arr[4][0] = 10;
		arr[4][1] = 5;
		findSymPairs(arr);
	}

	static void findSymPairs(int arr[][]) {
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int first = arr[i][0];
			int sec = arr[i][1];
			Integer val = hM.get(sec);
			if (val != null && val == first)
				System.out.println("(" + sec + ", " + first + ")");
			else
				hM.put(first, sec);
		}
	}
}
