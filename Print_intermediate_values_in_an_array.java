package Programming;

/*Input : arr[] = { 4, 2, 7, 5};
Output : Intermediate elements between 4 and 2 :- 2 3 4
Intermediate elements between 2 and 7 :- 2 3 4 5 6 7
Intermediate elements between 7 and 5 :- 5 6 7*/

public class Print_intermediate_values_in_an_array {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 7, 5 };
		inter(arr);

	}

	static void inter(int[] arr) {
		for (int l = 0; l < arr.length - 1; l++) {
			// points to first index element
			int i = arr[l];

			// points to preceding index element
			int j = arr[l + 1];

			// Find big element
			// between the above elements
			int big = i > j ? i : j;

			// Find small element
			// between the above elements
			int sml = i < j ? i : j;

			System.out.println("Intermediate elements between " + i + " and " + j);
			for (int k = sml; k <= big; k++)
				System.out.print(k + " ");

			System.out.println();
		}
	}

}
