package Programming;

/*Find a triplet that sum to a given value
Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
If there is such a triplet present in array, then print the triplet and return true. Else return false.
For example, if the given array is {12, 3, 4, 1, 6, 9} and given sum is 24, 
then there is a triplet (12, 3 and 9) present in array whose sum is 24.
Time Complexity: O(n^3)*/

public class FindTripletUsingSimple {

	public static void main(String[] args) {
		FindTripletUsingSimple triplet = new FindTripletUsingSimple();
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 22;
		int arr_size = A.length;

		triplet.find3Numbers(A, arr_size, sum);

	}

	boolean find3Numbers(int A[], int arr_size, int sum) {
		int l, r;

		for (int i = 0; i < arr_size - 2; i++) {

			for (int j = i + 1; j < arr_size - 1; j++) {

				for (int k = j + 1; k < arr_size; k++) {
					if (A[i] + A[j] + A[k] == sum) {
						System.out.print("Triplet is " + A[i] + " ," + A[j] + " ," + A[k]);
						return true;
					}
				}
			}
		}

		return false;
	}

}
