package Programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Program to check valid mobile number
Mobile Number validation criteria:

The first digit should contain number between 7 to 9.
The rest 9 digit can contain any number between 0 to 9.
The mobile number can have 11 digits also by including 0 at the starting.
The mobile number can be of 12 digits also by including 91 at the starting

Input : Enter Mobile Number: 7873923408
Output :Valid Mobile Number

Input : Enter Mobile Number: 5678729234
Output :Invalid Mobile Number*/

public class Check_Valid_Mobile_Number {

	public static void main(String[] args) {
		String s = "7873923408";
		if (isValid(s)) 
		   System.out.println("Valid Number");        
		else
		   System.out.println("Invalid Number");
	}

	public static boolean isValid(String s) {
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(s);
		return (m.find() && m.group().equals(s));
	}
}
