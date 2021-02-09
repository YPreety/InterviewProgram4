package String_Programming;

/*Input : string x = "1-5, 8, 11-14, 18, 20, 26-29" 
Output : string y = "1, 2, 3, 4, 5, 8, 11, 12, 13, 14, 18, 20, 26, 27, 28, 29"
*/

public class Expand_a_String_if_range_is_given {

	public static void main(String[] args) {
		String s = "1-5, 8, 11-14, 18, 20, 26-29";
		expand(s);

	}

	public static void expand(String s) {
		String p = s;
		String[] arr = p.split("\\-");
		String k = "";
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				String[] arr1 = arr[i].split(", ");
				String[] arr2 = arr[i + 1].split(", ");
				int a = Integer.parseInt(arr1[arr1.length - 1]);
				int b = Integer.parseInt(arr2[0]);
				for (int j = a + 1; j < b; j++) {
					arr[i] = arr[i] + ", " + j;
				}
			}
			if (k != "")
				k = k + ", " + arr[i];
			else
				k = k + arr[i];
		}

		System.out.println(k);
	}

	static String[] split(String st) {
		// Count how many words in our string
		// Irrespective of spaces
		int wc = countWords(st);
		String w[] = new String[wc];
		char[] c = st.toCharArray();
		int k = 0;
		for (int i = 0; i < c.length; i++) {
			String s = "";

			// Whenever we found an non-space character
			while (i < c.length && c[i] != ' ') {
				// Concat with the String s
				// Increment the value of i
				s = s + c[i];
				i++;
			}

			// If the String is not empty
			if (s.length() != 0) {

				// Add the String to the String[]
				// array
				w[k] = s;
				k++;
			}
		}

		// Returning the String[] array
		return w;
	}

	static int countWords(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			// The below condition to check
			// whether the first character is
			// space or not
			if (i == 0 && str.charAt(i) != ' ' || str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') {
				count++;
			}
		}
		return count;
	}

}
