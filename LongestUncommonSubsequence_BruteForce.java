package Programming;

import java.util.HashMap;
import java.util.Vector;

/*Input : "abcd", "abc"
Output : 4
The longest subsequence is 4 because "abcd"
is a subsequence of first string, but not
a subsequence of second string.

Input : "abc", "abc"
Output : 0
Both strings are same, so there is no 
uncommon subsequence.

Time complexity : O(2x + 2y), where x and y are the lengths of two strings.
Auxiliary Space : O(2x + 2y).*/

public class LongestUncommonSubsequence_BruteForce {

	public static void main(String[] args) {
		String a = "abcdabcd", b = "abcabc";
		System.out.println(findLUSlength(a, b));

	}

	static int findLUSlength(String a, String b) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Vector<String> strArr = new Vector<String>();
		strArr.add(a);
		strArr.add(b);
		for (String s : strArr) {
			for (int i = 0; i < (1 << s.length()); i++) {
				String t = "";
				for (int j = 0; j < s.length(); j++) {
					if (((i >> j) & 1) != 0)
						t += s.charAt(j);
				}
				if (map.containsKey(t))
					map.put(t, map.get(t) + 1);
				else
					map.put(t, 1);
			}
		}
		int res = 0;
		for (HashMap.Entry<String, Integer> entry : map.entrySet())	{
			if (entry.getValue() == 1)
				res = Math.max(res, entry.getKey().length());
		}
		return res;
	}
}
