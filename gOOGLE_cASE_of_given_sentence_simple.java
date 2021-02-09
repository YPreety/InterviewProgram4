package Programming;

/*Given a sentence, task is to rewrite in Google Case. It is a style of writing where we replace all lower case 
letters into upper case letters leaving the initial of all the words.

Input : gEEks fOr GeeKs
Output : gEEKS fOR gEEKS 

Input : I got intern at geeksforgeeks
Output : i gOT iNTERN aT gEEKSFORGEEKS */

public class gOOGLE_cASE_of_given_sentence_simple {

	public static void main(String[] args) {
		String str = "I Got Intern At Geeksforgeeks";
		System.out.println(convert(str));
	}

	static String convert(String str) {
		String w = "", z = "";
		str = str.toUpperCase() + " ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ')
				w = w + ch;
			else {
				z = z + (Character.toLowerCase(w.charAt(0))) + w.substring(1) + " ";
				w = "";
			}
		}

		return z;
	}
}
