package Programming;

import java.util.HashMap;

public class FrequencyOfSortedArray {

	static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 4, 2, 1 };
		int n = a.length;
		countFreq(a, n);
		System.out.println(query(2));
		System.out.println(query(3));
		System.out.println(query(5));

	}

	static int query(int x) {
		if (hm.containsKey(x))
			return hm.get(x);
		return 0;
	}

	static void countFreq(int a[], int n) {

		for (int i = 0; i < n; i++)
			if (hm.containsKey(a[i]))
				hm.put(a[i], hm.get(a[i]) + 1);
			else
				hm.put(a[i], 1);
	}

}
