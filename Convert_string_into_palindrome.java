package Programming;

/*Convert the string into palindrome string by changing only one character.
Given a string str. Check if it is possible to convert the string into palindrome string by changing only one character.

Input : str = "abccaa"
Output : Yes

Input : str = "abbcca"
Output : No*/
public class Convert_string_into_palindrome {

	public static void main(String[] args) {
		String str = "abccaa";
		if (checkPalindrome(str))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	static boolean checkPalindrome(String str) {
		int n = str.length();
		int count = 0;
		for (int i = 0; i < n / 2; ++i)
			if (str.charAt(i) != str.charAt(n - i - 1))
				++count;
		return (count <= 1);
	}
}
