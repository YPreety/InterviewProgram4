package Programming;

/*Write a Java program to take an input string and exchange the first and last word and revers the middle word.

Input : Hello World GFG Welcomes You
Output :You semocleW GFG dlroW Hello*/

public class Swap_corner_words_and_reverse_middle_characters {

	public static void main(String[] args) {
		String s = "Hello World GFG Welcomes You";
		print(s);

	}

	static void print(String s) {
		String fst = "";
		int i = 0;
		for (i = 0; i < s.length();) {
			while (s.charAt(i) != ' ') {
				fst = fst + s.charAt(i);
				i++;
			}
			break;
		}
		String last = "";
		int j = 0;
		for (j = s.length() - 1; j >= i;) {
			while (s.charAt(j) != ' ') {
				last = s.charAt(j) + last;
				j--;
			}
			break;
		}
		System.out.print(last);
		for (int m = j; m >= i; m--) {
			System.out.print(s.charAt(m));
		}
		System.out.println(fst);
	}
}
