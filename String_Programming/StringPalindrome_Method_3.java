package String_Programming;

import java.util.Scanner;

public class StringPalindrome_Method_3 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = r.next();
        boolean out = isPalindrom(str);
        System.out.println(out);
	}
	public static boolean isPalindrom(String str){
		if(str == null)
        	return false;
        int length = str.length();
        for(int i =0 ; i<length/2 ; i++){
        	if(str.charAt(i) != str.charAt(length-i-1))
        		return false;
        }
        return true;
	}
}
