package Programming;

/*Given two strings s1 and s2(call letters in uppercase). Check if it is possible to convert s1 to s2 by performing 
following operations.
1. Make some lowercase letters uppercase.
2. Delete all the lowercase letters.

Input : s1 = daBcd s2 = ABC 
Output : yes
Explanation : daBcd -> dABCd -> ABC Covert a and b at index 1 and 3 to upper case, delete the rest those are 
lowercase. We get the string s2. 

Input : s1 = argaju    s2 = RAJ
Output : yes 
Explanation : argaju -> aRgAJu -> RAJ convert index 1, 3 and 4 to uppercase and then delete. All lowercase letters

Input : s1 = ABcd s2= BCD 
Output : NO*/

public class Check_if_it_is_possible_to_transform_one_string_to_another {

	public static void main(String[] args) {
		String s1 = "daBcd";
		String s2 = "ABC";
		if (check(s1, s2))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	static boolean check(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		boolean dp[][] = new boolean[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				dp[i][j] = false;
			}
		}
		dp[0][0] = true;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				if (dp[i][j]) {
					if (j < s2.length() && (Character.toUpperCase(s1.charAt(i)) == s2.charAt(j)))
						dp[i + 1][j + 1] = true;
					if (!Character.isUpperCase(s1.charAt(i)))
						dp[i + 1][j] = true;
				}
			}
		}
		return (dp[n][m]);
	}
}
