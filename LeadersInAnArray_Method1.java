package Programming;

public class LeadersInAnArray_Method1 {

	public static void main(String[] args) {
		LeadersInAnArray_Method1 lead = new LeadersInAnArray_Method1();
		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		lead.printLeaders(arr, n);

	}

	void printLeaders(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			int j;
			for (j = i + 1; j < size; j++) {
				if (arr[i] <= arr[j])
					break;
			}
			if (j == size) // the loop didn't break
				System.out.print(arr[i] + " ");
		}
	}

}
