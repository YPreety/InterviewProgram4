package Programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Find all the patterns of “1(0+)1” in a given string 
Input : 1101001
Output : 2

Input : 100001abc101
Output : 2*/
public class Find_all_the_patterns_Regular_Expression_Approach {

	public static void main(String[] args) {
		String str = "1001ab010abc01001";
		System.out.println(patternCount(str));

	}

	static int patternCount(String str) {
		String regex = "10+1";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		int counter = 0;
		while (m.find()) {
			m.region(m.end() - 1, str.length());
			counter++;
		}
		return counter;
	}
}
