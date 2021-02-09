package Programming;

/*Fill array with 1’s using minimum iterations of filling neighbors
Given an array of 0s and 1s, in how many iterations the whole array can be filled with 1s 
if in a single iteration immediate neighbors of 1s can be filled.
NOTE: If we cannot fill array with 1s, then print “-1” .

Input : arr[] = {1, 0, 1, 0, 0, 1, 0, 1, 
        1, 0, 1, 1, 0, 0, 1}
Output : 1
To convert the whole array into 1s, one iteration
is required. Between indexes i=2 and i=5, the zero 
at i=3 would be converted to '1' due to its neighbours
at i=2 similarly the zero at i=4 would be converted 
into '1' due to its neighbor at i=5, all this can 
be done in a single iteration. Similarly all 0's can
be converted to 1 in single iteration.

Input : arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0, 
       1, 1, 1, 1, 0, 0, 0, 1}
Output : 2

Time Complexity : O(n)*/

public class FillArrayWith1 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0 };

		System.out.println(countIterations(arr, arr.length));

	}

	static int countIterations(int arr[], int n) {
		boolean oneFound = false;
		int res = 0;

		for (int i = 0; i < n;) {
			if (arr[i] == 1)
				oneFound = true;

			while (i < n && arr[i] == 1)
				i++;

			int count_zero = 0;
			while (i < n && arr[i] == 0) {
				count_zero++;
				i++;
			}

			if (oneFound == false && i == n)
				return -1;

			int curr_count;
			if (i < n && oneFound == true) {

				if ((count_zero & 1) == 0)
					curr_count = count_zero / 2;

				else
					curr_count = (count_zero + 1) / 2;

				count_zero = 0;
			}

			else {
				curr_count = count_zero;
				count_zero = 0;
			}

			res = Math.max(res, curr_count);
		}

		return res;
	}

}
