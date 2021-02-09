package Programming;

//Java program to Compare two strings lexicographically
public class Compare_Two_Strings_without_library_function {

	public static void main(String[] args) {
		String string1 = new String("Geeks");
		String string2 = new String("Practice");
		String string3 = new String("Geeks");

		System.out.println(stringCompare(string1, string2)); //-9
		System.out.println(stringCompare(string1, string3)); //0 
		System.out.println(stringCompare(string2, string1)); //9
	}

	public static int stringCompare(String str1, String str2) {
		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
				continue;
			} else {
				return (int) str1.charAt(i) - (int) str2.charAt(i);
			}
		}
		if (str1.length() < str2.length()) {
			return (int) str1.charAt(str2.length());
		} else if (str1.length() > str2.length()) {
			return (int) str1.charAt(str2.length());
		}
		else {
			return 0;
		}
	}
}
