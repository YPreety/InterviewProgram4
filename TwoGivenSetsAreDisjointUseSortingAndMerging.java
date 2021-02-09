package Programming;

//Time complexity is O(mLogm + nLogn).
import java.util.Arrays;

public class TwoGivenSetsAreDisjointUseSortingAndMerging {

	public static void main(String[] args) {
		TwoGivenSetsAreDisjointUseSortingAndMerging dis = new TwoGivenSetsAreDisjointUseSortingAndMerging();
		int set1[] = { 12, 34, 11, 9, 3 };
		int set2[] = { 7, 2, 1, 5 };

		boolean result = dis.aredisjoint(set1, set2);
		if (result)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	boolean aredisjoint(int set1[], int set2[]) {
		int i = 0, j = 0;
		Arrays.sort(set1);
		Arrays.sort(set2);
		while (i < set1.length && j < set2.length) {
			if (set1[i] < set2[j])
				i++;
			else if (set1[i] > set2[j])
				j++;
			else
				return false;
		}
		return true;
	}
}
