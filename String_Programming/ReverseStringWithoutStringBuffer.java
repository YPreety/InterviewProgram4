package String_Programming;

public class ReverseStringWithoutStringBuffer {

	public static void main(String[] args) {
		String str = "abcde";
		System.out.println("original String " + str);
		System.out.println("reverse string " +reverseString(str));
	}

	public static String reverseString(String originalString) {
		char ar[] = originalString.toCharArray();
		char temp;
		for (int i = 0, j = ar.length - 1; i < (ar.length / 2); i++, j--) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
		return new String(ar);
	}
}
