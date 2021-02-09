package Programming;

public class LongestUncommonSubsequence_Efficient {

	public static void main(String[] args) {
		String a = "abcdabcd", b = "abcabc";
		System.out.println(findLUSlength(a, b));
	}

	static int findLUSlength(String a, String b) {

		if (a.equals(b) == true)
			return 0;
		return Math.max(a.length(), b.length());
	}
}
