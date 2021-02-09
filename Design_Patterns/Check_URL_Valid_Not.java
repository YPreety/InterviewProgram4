package Design_Patterns;

import java.net.URL;

/*Input : str = "https://www.geeksforgeeks.org/"
Output : Yes


Input : str = "https:// www.geeksforgeeks.org/"
Output : No
Note that there is a space after https://
*/
public class Check_URL_Valid_Not {

	public static void main(String[] args) {
		String url1 = "http://www.geeksforgeeks.org/";
		if (isValid(url1))
			System.out.println("Yes");
		else
			System.out.println("No");

		String url2 = "http:// www.geeksforgeeks.org/";
		if (isValid(url2))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	public static boolean isValid(String url) {
		try {
			new URL(url).toURI();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

}
