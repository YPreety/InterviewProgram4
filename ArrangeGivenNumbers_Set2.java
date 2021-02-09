package Programming;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Input :  [1, 34, 3, 98, 9, 76, 45, 4, 12, 121]
Output : 99876454343121211

Input :  [12, 121]
Output : 12121*/

public class ArrangeGivenNumbers_Set2 {

	public static void main(String[] args) {
		Integer arr[] = { 1, 34, 3, 98, 9, 76, 45, 4, 12, 121 };
		List<Integer> l = Arrays.asList(arr);

		System.out.println(largestNumber(l));

	}

	public static String largestNumber(List<Integer> arr) {
		// finding number of digits in maximum element
		// present in array
		int n = Collections.max(arr).toString().length();

		ArrayList<ExtendedNum> en = new ArrayList<ExtendedNum>();
		for (int i = 0; i < arr.size(); i++)
			en.add(new ExtendedNum(arr.get(i), n));

		// sort based on modified value
		Collections.sort(en, (p1, p2) -> (int) (p2.modifiedValue - p1.modifiedValue));

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < en.size(); i++)
			sb.append(new StringBuilder(Long.toString(en.get(i).originalValue)));

		// To remove any zeroes at head.
		BigInteger bi = new BigInteger(sb.toString());

		return bi.toString();
	}

}

class ExtendedNum {
	int originalValue;
	long modifiedValue;

	public ExtendedNum(int originalValue, int n) {
		this.originalValue = originalValue;
		String s = Integer.toString(originalValue);
		StringBuilder sb = new StringBuilder(s);
		StringBuilder ans = new StringBuilder();
		while (ans.length() <= n + 1)
			ans.append(sb);

		s = ans.toString().substring(0, n + 1);
		modifiedValue = Long.parseLong(s);
	}

	public String toString() {
		return "[" + modifiedValue + ", " + originalValue + "]";
	}
}
