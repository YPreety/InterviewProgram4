package Programming;

//Time Complexity: O(n)

public class OccurringOddNumberWithBitwiseXOR {

	public static void main(String[] args) {
		OccurringOddNumberWithBitwiseXOR occur = new OccurringOddNumberWithBitwiseXOR();
		int ar[] = new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		int n = ar.length;
		System.out.println(occur.getOddOccurrence(ar, n));

	}

	int getOddOccurrence(int ar[], int ar_size) {
		int i;
		int res = 0;
		for (i = 0; i < ar_size; i++) {
			res = res ^ ar[i];
		}
		return res;
	}

}
