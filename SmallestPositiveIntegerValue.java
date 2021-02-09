package Programming;

/*Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
Input:  arr[] = {1, 3, 6, 10, 11, 15};
Output: 2

Input:  arr[] = {1, 1, 1, 1};
Output: 5

Input:  arr[] = {1, 1, 3, 4};
Output: 10

Input:  arr[] = {1, 2, 5, 10, 20, 40};
Output: 4

Input:  arr[] = {1, 2, 3, 4, 5, 6};
Output: 22
Time Complexity is O(n).*/

public class SmallestPositiveIntegerValue {

	public static void main(String[] args) {
		SmallestPositiveIntegerValue small = new SmallestPositiveIntegerValue();
		int arr1[] = { 1, 3, 4, 5 };
		int n1 = arr1.length;
		System.out.println(small.findSmallest(arr1, n1));
	}

	int findSmallest(int arr[], int n) {
		int res = 1; 
		for (int i = 0; i < n && arr[i] <= res; i++)
			res = res + arr[i];
		return res;
	}
}
