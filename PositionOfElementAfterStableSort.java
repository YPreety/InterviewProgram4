package Programming;

/*Given an array of integers which may contain duplicate elements, an element of this array is given to us, 
we need to tell the final position of this element in the array, if a stable sort algorithm is applied.
Input  : arr[] = [3, 4, 3, 5, 2, 3, 4, 3, 1, 5], index = 5
Output : 4
Element initial index – 5 (third 3)
After sorting array by stable sorting algorithm, we get 
array as shown below
[1(8), 2(4), 3(0), 3(2), 3(5), 3(7), 4(1), 4(6), 5(3), 5(9)]
with their initial indices shown in parentheses next to them,
Element's index after sorting = 4
*/
public class PositionOfElementAfterStableSort {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 3, 5, 2, 3, 4, 3, 1, 5 };
		int n = arr.length;

		int idxOfEle = 5;
		System.out.println(getIndexInSortedArray(arr, n, idxOfEle));

	}

	static int getIndexInSortedArray(int arr[], int n, int idx) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < arr[idx])
				result++;
			if (arr[i] == arr[idx] && i < idx)
				result++;
		}
		return result;
	}

}
