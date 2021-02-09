package Programming;

import java.util.Scanner;

/*Given a numeric string (length <= 32), split it into two or more integers( if possible), such that 
1) Difference between current and previous number is 1.
2) No number contains leading zeroes
If it is possible to separate a given numeric string then print “Possible” followed by the first number of the 
increasing sequence, else print “Not Possible“.

Input : 1234
Output : Possible 1
Explanation: String can be split as "1", "2", 
"3", "4"

Input : 99100
Output :Possible 99
Explanation: String can be split as "99",
"100"

Input : 101103
Output : Not Possible
Explanation: It is not possible to split this 
string under given constraint.*/

public class Splitting_Numeric_String {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "99100";
		split(str);
	}

	public static void split(String str) {
		int len = str.length();
		if (len == 1) {
			System.out.println("Not Possible");
			return;
		}
		String s1 = "", s2 = "";
		long num1, num2;
		for (int i = 0; i <= len / 2; i++) {
			int flag = 0;
			s1 = str.substring(0, i + 1);
			num1 = Long.parseLong((s1));
			num2 = num1 + 1;
			s2 = Long.toString(num2);
			int k = i + 1;
			while (flag == 0) {
				int l = s2.length();
				if (k + l > len) {
					flag = 1;
					break;
				}
				if ((str.substring(k, k + l).equals(s2))) {
					flag = 0;
					num2++;
					k = k + l;
					if (k == len)
						break;
					s2 = Long.toString(num2);
					l = s2.length();
					if (k + 1 > len) {
						flag = 1;
						break;
					}
				}

				else
					flag = 1;
			}
			if (flag == 0) {
				System.out.println("Possible" + " " + s1);
				break;
			}
			else if (flag == 1 && i > len / 2 - 1) {
				System.out.println("Not Possible");
				break;
			}
		}
	}
}
