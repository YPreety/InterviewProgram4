package Programming;

public class gOOGLE_cASE_of_given_sentence_efficient {

	public static void main(String[] args) {
		String str = "I get intern at geeksforgeeks";
		System.out.println(convert(str));
	}

	static String convert(String s) {
		int n = s.length();
		String s1 = "";
		s1 = s1 + Character.toLowerCase(s.charAt(0));
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == ' ' && i < n) {
				s1 = s1 + " " + Character.toLowerCase(s.charAt(i + 1));
				i++;
			}
			else
				s1 = s1 + Character.toUpperCase(s.charAt(i));
		}
		return s1;
	}
}
