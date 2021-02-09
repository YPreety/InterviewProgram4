package Programming;

/*Longest Span with same Sum in two Binary arrays
Given two binary arrays arr1[] and arr2[] of same size n. 
Find length of the longest common span (i, j)
where j >= i such that arr1[i] + arr1[i+1] + …. + arr1[j] = arr2[i] + arr2[i+1] + …. + arr2[j].

Time Complexity: O(n2)
Auxiliary Space: O(1)

Input: arr1[] = {0, 1, 0, 0, 0, 0};
arr2[] = {1, 0, 1, 0, 0, 1};
Output: 4
The longest span with same sum is from index 1 to 4.

Input: arr1[] = {0, 1, 0, 1, 1, 1, 1};
arr2[] = {1, 1, 1, 1, 1, 0, 1};
Output: 6
The longest span with same sum is from index 1 to 6.

Input: arr1[] = {0, 0, 0};
arr2[] = {1, 1, 1};
Output: 0

Input: arr1[] = {0, 0, 1, 0};
arr2[] = {1, 1, 1, 1};
Output: 1
*/
public class LongestSpanSumSimple {
	static int arr1[] = new int[] { 0, 1, 0, 1, 1, 1, 1 };
	static int arr2[] = new int[] { 1, 1, 1, 1, 1, 0, 1 };

	public static void main(String[] args) {
		System.out.print("Length of the longest common span with same sum is ");
		System.out.println(longestCommonSum(arr1.length));
	}

	static int longestCommonSum(int n) {
		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			int sum1 = 0, sum2 = 0;
			for (int j = i; j < n; j++) {
				sum1 += arr1[j];
				sum2 += arr2[j];
				if (sum1 == sum2) {
					int len = j - i + 1;
					if (len > maxLen)
						maxLen = len;
				}
			}
		}
		return maxLen;
	}
}
