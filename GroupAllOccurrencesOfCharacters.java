package Programming;

/*Group all occurrences of characters according to first appearance
Given a string of lowercase characters, the task is to print the string in a manner such that a character 
comes first in string displays first with all its occurrences in string.

Input : str = "geeksforgeeks"
Output:  ggeeeekkssfor
Explanation: In the given string 'g' comes first 
and occurs 2 times so it is printed first
Then 'e' comes in this string and 4 times so 
it gets printed. Similarly remaining string is
printed.

Input :  str = "occurrence"
output : occcurreen 

Input  : str = "cdab"
Output : cdab*/

public class GroupAllOccurrencesOfCharacters {

	static final int MAX_CHAR = 26;
	
	public static void main(String[] args) {
		String str = new String("geeksforgeeks");

		printGrouped(str);

	}

	static void printGrouped(String str) {
		int n = str.length();

		int count[] = new int[MAX_CHAR];

		for (int i = 0; i < n; i++)
			count[str.charAt(i) - 'a']++;

		for (int i = 0; i < n; i++) {

			while (count[str.charAt(i) - 'a'] != 0) {
				System.out.print(str.charAt(i));
				count[str.charAt(i) - 'a']--;
			}

			count[str.charAt(i) - 'a'] = 0;
		}
	}

}
