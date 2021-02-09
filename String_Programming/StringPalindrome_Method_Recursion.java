package String_Programming;

import java.util.Scanner;

public class StringPalindrome_Method_Recursion {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = r.next();
        boolean out = isPalindrom(str);
        System.out.println(out);
	}
	public static boolean isPalindrom(String str){
		if(str.length() == 0 || str.length() == 1)
			return true;
		if(str.charAt(0) == str.charAt(str.length()-1)){
			return isPalindrom(str.substring(1, str.length()-1));
		}
			return false;
	}
}
