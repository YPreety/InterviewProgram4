package Programming;

/*Input : arr1[] = {2, 4, 5, 7, 8, 10, 12, 15}.
arr2[] = {5, 8, 11, 12, 14, 15}.
Output : 2 4 7 10 11 14        
arr1[] - arr2[] = {2, 4, 7, 10}.
arr[2] - arr1[] = {11, 14}.
SymmDiff = (arr1[] - arr2[]) UNION (arr2[] - arr1[]).
         = {2, 4, 7, 10, 11, 14}.


Input : arr1[] = {1, 3, 5, 8, 15, 27, 35}.
arr2[] = {5, 7, 8, 11, 15, 18, 35}.
Output : 1 3 7 11 18 27
arr1[] - arr2[] = {1, 3, 27}.
arr[2] - arr1[] = {7, 11, 18}.
SymmDiff = (arr1[] - arr2[]) UNION (arr2[] - arr1[]).
         = {1, 3, 7, 11, 18, 27}.*/

public class Symmetricdifferenceoftwosortedarray {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 5, 7, 8, 10, 12, 15 };
		int[] arr2 = { 5, 8, 11, 12, 14, 15 };
		int n = arr1.length;
		int m = arr2.length;
		symmDiff(arr1, arr2, n, m);
	}

	static void symmDiff(int[] arr1, int[] arr2, int n, int m) {
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
			} else if (arr2[j] < arr1[i]) {
				System.out.print(arr2[j] + " ");
				j++;
			}
			else {
				i++;
				j++;
			}
		}
	}
}
