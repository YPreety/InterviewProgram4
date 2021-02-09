package Programming;

/*Input: str = "aabababa";
Output: Second most frequent character is 'b'

Input: str = "geeksforgeeks";
Output: Second most frequent character is 'g'

Input: str = "geeksquiz";
Output: Second most frequent character is 'g'
The output can also be any other character with 
count 1 like 'z', 'i'.

Input: str = "abcd";
Output: No Second most frequent character*/

//Time complexity of this solution is O(n).

public class FindSecondMostFrequentCharacter {

	static final int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		char res = getSecondMostFreq(str);
		if (res != '\0')
			System.out.println("Second most frequent char" + " is " + res);
		else
			System.out.println("No second most frequent" + "character");

	}

	static char getSecondMostFreq(String str) {

		int[] count = new int[NO_OF_CHARS];
		int i;
		for (i = 0; i < str.length(); i++)
			(count[str.charAt(i)])++;

		int first = 0, second = 0;
		for (i = 0; i < NO_OF_CHARS; i++) {

			if (count[i] > count[first]) {
				second = first;
				first = i;
			}

			else if (count[i] > count[second] && count[i] != count[first])
				second = i;
		}

		return (char) second;
	}

}
