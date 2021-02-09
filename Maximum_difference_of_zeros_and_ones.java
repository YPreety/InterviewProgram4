package Programming;

/*Maximum difference of zeros and ones in binary string 
Given a binary string of 0s and 1s. The task is to find the length of substring which is having a maximum difference of 
number of 0s and number of 1s (number of 0s – number of 1s). In case of all 1s print -1

Input : S = "11000010001"
Output : 6
From index 2 to index 9, there are 7
0s and 1 1s, so number of 0s - number
of 1s is 6.

Input : S = "1111"
Output : -1

Time Complexity : O(n)
Space complexity : O(1)*/

public class Maximum_difference_of_zeros_and_ones {

	public static void main(String[] args) {
		String str = "11000010001";
		int n = str.length();
		System.out.println(findLength(str, n));
	}

	public static int findLength(String str, int n) {
		int current_sum = 0;
		int max_sum = 0;
		for (int i = 0; i < n; i++) {
			current_sum += (str.charAt(i) == '0' ? 1 : -1);
			if (current_sum < 0)
				current_sum = 0;
			max_sum = Math.max(current_sum, max_sum);
		}
		return max_sum == 0 ? -1 : max_sum;
	}
}
