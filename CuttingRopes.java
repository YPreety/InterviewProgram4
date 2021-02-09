package Programming;

import java.util.Arrays;

/*Ropes left after every removal of smallest
Input : Ropes[] = { 5, 1, 1, 2, 3, 5 }
Output : 4 3 2
Explanation : In first operation the minimum ropes is 1 so we reduce length 1 
from all of them after reducing we left with 4 ropes and we do same for rest.

Input : Ropes[] = { 5, 1, 6, 9, 8, 11, 2, 2, 6, 5 }
Output : 9 7 5 3 2 1

Time Complexity : O(n long (n))
Space complexity : O(1)*/

public class CuttingRopes {

	public static void main(String[] args) {
		int[] Ropes = { 5, 1, 1, 2, 3, 5 };
		int n = Ropes.length;
		cuttringRopes(Ropes, n);

	}

	public static void cuttringRopes(int Ropes[], int n) {
		Arrays.sort(Ropes);
		int singleOperation = 0;
		int cuttingLenght = Ropes[0];
		for (int i = 1; i < n; i++) {
			if (Ropes[i] - cuttingLenght > 0) {
				System.out.print(n - i + " ");
				cuttingLenght = Ropes[i];
				singleOperation++;
			}
		}
		if (singleOperation == 0)
			System.out.print("0");
	}
}
