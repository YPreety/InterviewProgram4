package Programming;

/*Count of occurrences of a “1(0+)1” pattern in a string
Input : 1001010001
Output : 3
Input : 1001ab010abc01001
Output : 2*/

public class Find_all_the_patterns_Simple {

	public static void main(String[] args) {
		String str = "100001abc101";
		System.out.println(countPattern(str));
	}

	static int countPattern(String str) {
		int len = str.length();
		boolean oneSeen = false;
		int count = 0;
		for (int i = 0; i < len; i++) {
			char getChar = str.charAt(i);
			if (getChar == '1' && oneSeen == false)
				oneSeen = true;
			else if (getChar != '0' && str.charAt(i) != '1')
				oneSeen = false;
			else if (getChar == '1' && oneSeen == true) {
				if (str.charAt(i - 1) == '0')
					count++;
			}
		}
		return count;
	}
}
