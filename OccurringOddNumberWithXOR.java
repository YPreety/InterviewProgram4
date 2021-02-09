package Programming;

/*Find the two numbers with odd occurrences in an unsorted array
Time Complexity: O(n)
Auxiliary Space: O(1)
*/
public class OccurringOddNumberWithXOR {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 4, 5, 2, 3, 3, 1 };
		int arr_size = arr.length;
		printTwoOdd(arr, arr_size);

	}

	static void printTwoOdd(int arr[], int size) {
		int xor2 = arr[0];
		int set_bit_no;
		int i;
		int n = size - 2;
		int x = 0, y = 0;
		for (i = 1; i < size; i++)
			xor2 = xor2 ^ arr[i];
		set_bit_no = xor2 & ~(xor2 - 1);
		for (i = 0; i < size; i++) {
			if ((arr[i] & set_bit_no) > 0)
				x = x ^ arr[i];
			else
				y = y ^ arr[i];
		}

		System.out.println("The two ODD elements are " + x + " & " + y);
	}

}
