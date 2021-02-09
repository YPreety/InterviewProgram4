package Design_Patterns;

import java.util.regex.Pattern;

/*Input : email = "contribute@geeksforgeeks.org"
Output : Yes

Input : email = "contribute@geeksforgeeks..org"
Output : No
There is an extra dot before org.*/

public class Check_Email_Address_Valid_Not {

	public static void main(String[] args) {
		String email = "contribute@geeksforgeeks..org";
		if (isValid(email))
			System.out.print("Yes");
		else
			System.out.print("No");

	}

	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

}
