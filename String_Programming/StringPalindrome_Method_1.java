package String_Programming;

import java.util.Scanner;

public class StringPalindrome_Method_1 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = r.next();
        String revStr = "";
        for (int i = str.length()-1 ; i>=0 ; i--){
        	revStr = revStr + str.charAt(i);
        }
        if(revStr.equalsIgnoreCase(str)){
        	System.out.println("Palindrome");
        }else{
        	System.out.println("Not Palindrome");
        }
	}

}
