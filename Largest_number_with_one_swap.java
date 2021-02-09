package Programming;

/*Input: 2736
Output : 7236
Explanation:
If we swap the number 2 and the number
7 then the generated number would be 
the largest number.

Input : 432
Output : 432
Explanation:
Here, no swap is required. The given
number is already largest.*/

public class Largest_number_with_one_swap {

	static String swap(String str, int i, int j) {
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		String c = String.valueOf(ch);
		return c;
	}

	// function to find the largest number
	// with given conditions.
	static int largestNum(int num) {
		// converting the number to the string
		String num_in_str = "" + num;
		String temp = num_in_str;

		// swamping each digit
		for (int i = 0; i < num_in_str.length(); i++) {
			for (int j = i + 1; j < num_in_str.length(); j++) {

				// Swapping and checking for the larger
				num_in_str = swap(num_in_str, i, j);
				if (temp.compareTo(num_in_str) < 0)
					temp = num_in_str;

				// Reverting the changes
				num_in_str = swap(num_in_str, i, j);
			}
		}

		return Integer.parseInt(temp);
	}

	// Driver code
	public static void main(String[] s) {
		int num = 423;
		System.out.println(largestNum(num));
		num = 2736;
		System.out.println(largestNum(num));
		num = 4596;
		System.out.println(largestNum(num));
	}

}
