package Programming;

/*Three way partitioning of an array around a given range
Given an array and a range [lowVal, highVal], partition the array around the range such that array is divided in three parts.
1) All elements smaller than lowVal come first.
2) All elements in range lowVal to highVVal come next.
3) All elements greater than highVVal appear in the end.
The individual elements of three sets can appear in any order.

Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
lowVal = 14, highVal = 20
Output: arr[] = {1, 5, 4, 2, 1, 3, 14, 20, 20, 98, 87, 32, 54}

Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
lowVal = 20, highVal = 20       
Output: arr[] = {1, 14, 5, 4, 2, 1, 3, 20, 20, 98, 87, 32, 54} 

Time Complexity : O(n)
Auxiliary Space : O(1)*/

public class ThreeWayPartitioning {

	public static void main(String[] args) {
		int arr[] = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
		threeWayPartition(arr, 10, 20);
		System.out.println("Modified array ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void threeWayPartition(int[] arr, int lowVal, int highVal) {
		int n = arr.length;
		int start = 0, end = n - 1;
		for (int i = 0; i < end;) {
			if (arr[i] < lowVal) {
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start++;
				i++;
			}
			else if (arr[i] > highVal) {
				int temp = arr[end];
				arr[end] = arr[i];
				arr[i] = temp;
				end--;
			}
			else
			i++;
		}
	}
}
