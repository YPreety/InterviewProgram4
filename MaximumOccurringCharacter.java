package Programming;

/*Time Complexity: O(n)
Space Complexity: O(1) — Because we are using fixed space (Hash array) irrespective of input string size.*/

public class MaximumOccurringCharacter {

	static final int ASCII_SIZE = 256;

	public static void main(String[] args) {
		String str = "sample string";
		System.out.println("Max occurring character is " + getMaxOccuringChar(str));
	}

	static char getMaxOccuringChar(String str) {
		int count[] = new int[ASCII_SIZE];
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		int max = -1;
		char result = ' ';
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
}
