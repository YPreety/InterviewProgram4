package String_Programming;

import java.util.Scanner;

public class StringPalindrome_Method_2 {

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
        StringBuilder sb = new StringBuilder(str); 
        sb.reverse();
        return sb.toString().equals(str);
	}
}
