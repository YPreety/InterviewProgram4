package String_Programming;

import java.util.Scanner;

public class StringPalindrome_Longest_Method {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = r.next();
		String out = longestPalindrom(str);
		System.out.println(out);
	}

	public static String longestPalindrom(String str) {
		if(str == null)
			return null;
		String longest = str.substring(0,1);
		for(int i =0 ; i<str.length()-1; i++){
			// odd case like 121
			String palindrome = intermediatePalindrome(str,i,i);
			if(palindrome.length() > longest.length()){
				longest = palindrome;
			}
			// even case like 1221
			palindrome = intermediatePalindrome(str,i,i+1);
			if(palindrome.length() > longest.length()){
				longest = palindrome;
			}
		}
		return longest;
	}
	
	public static String intermediatePalindrome(String str , int left , int right){
		if(left > right)
			return null;
		while(left >= 0 && right <str.length() && str.charAt(left) == str.charAt(right)){
			left--;
			right++;
		}
		return str.substring(left+1, right);
	}
}
