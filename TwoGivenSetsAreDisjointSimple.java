package Programming;

/*Input: set1[] = {12, 34, 11, 9, 3}
set2[] = {2, 1, 3, 5}
Output: Not Disjoint
3 is common in two sets.

Input: set1[] = {12, 34, 11, 9, 3}
set2[] = {7, 2, 1, 5}
Output: Yes, Disjoint
There is no common element in two sets.*/

//Time complexity of this method is O(mn).

public class TwoGivenSetsAreDisjointSimple {

	public static void main(String[] args) {
		TwoGivenSetsAreDisjointSimple dis = new TwoGivenSetsAreDisjointSimple();
		int set1[] = { 12, 34, 11, 9, 3 };
		int set2[] = { 7, 2, 1, 5 };
		boolean result = dis.aredisjoint(set1, set2);
		if (result)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	boolean aredisjoint(int set1[], int set2[]) {
		for (int i = 0; i < set1.length; i++) {
			for (int j = 0; j < set2.length; j++) {
				if (set1[i] == set2[j])
					return false;
			}
		}
		return true;
	}
}
