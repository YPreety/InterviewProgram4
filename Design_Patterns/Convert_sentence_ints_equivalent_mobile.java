package Design_Patterns;

/*Convert a sentence into its equivalent mobile numeric keypad sequence
Time complexity : O(n)
Input : GEEKSFORGEEKS
Output : 4335736743357

Input : HELLO WORLD
Output : 43556096753*/

public class Convert_sentence_ints_equivalent_mobile {

	public static void main(String[] args) {
		String str[] = { "2", "2", "2", "3", "3", "3", "4", "4", "4", "5", "5", "5", "6", "6", "6", "7",
				"7", "7", "7", "8", "8", "8", "9", "9", "9", "9" };

		String input = "HELLO WORLD";
		System.out.println(printSequence(str, input));

	}

	static String printSequence(String arr[], String input) {
		String output = "";

		// length of input string
		int n = input.length();
		for (int i = 0; i < n; i++) {
			// Checking for space
			if (input.charAt(i) == ' ')
				output = output + "0";

			else {
				// Calculating index for each
				// character
				int position = input.charAt(i) - 'A';
				output = output + arr[position];
			}
		}

		// Output sequence
		return output;
	}

}
