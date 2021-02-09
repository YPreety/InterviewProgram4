package Programming;

/*Input : arr[] = { 2, 2, 3, 5, 6 } ; 
Output : 20
Explanation : We make the array as {2, 3, 4, 5, 6}. Sum becomes 2 + 3 + 4 + 5 + 6 = 20

Input : arr[] = { 20, 20 } ; 
Output : 41
Explanation : We make {20, 21}

Input :  arr[] = { 3, 4, 6, 8 };
Output : 21
Explanation : All elements are unique 
so result is sum of each elements.  
Time Complexity : O(n^2)*/
public class MakingElementsDistinct1 {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 3, 5, 6 };
		int n = arr.length;
		System.out.println(minSum(arr, n));

	}

	static int minSum(int arr[], int n) {
		int sum = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1]) {
				int j = i;
				while (j < n && arr[j] <= arr[j - 1]) {
					arr[j] = arr[j] + 1;
					j++;
				}
			}
			sum = sum + arr[i];
		}

		return sum;
	}

}
