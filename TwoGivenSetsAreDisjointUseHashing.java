package Programming;

import java.util.HashSet;

//Time complexity is O(m+n)

public class TwoGivenSetsAreDisjointUseHashing {

	public static void main(String[] args) {
		int set1[] = { 10, 5, 3, 4, 6 };
		int set2[] = { 8, 7, 9, 3 };
		if (areDisjoint(set1, set2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	static boolean areDisjoint(int set1[], int set2[]) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < set1.length; i++)
			set.add(set1[i]);
		for (int i = 0; i < set2.length; i++)
			if (set.contains(set2[i]))
				return false;
		return true;
	}
}
