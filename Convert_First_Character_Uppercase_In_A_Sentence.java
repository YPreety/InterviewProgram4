package Programming;

/*Java program to convert first character uppercase in a sentence
Input : gEEKs
Output :Geeks

Input :GFG
Output :Gfg*/

public class Convert_First_Character_Uppercase_In_A_Sentence {

	public static void main(String[] args) {
		String str = "gEEks fOr GeeKs";
		System.out.println(convert(str));
	}

	static String convert(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {  
					ch[i] = (char) (ch[i] - 'a' + 'A'); 
				}
			}
			else if (ch[i] >= 'A' && ch[i] <= 'Z') 
				ch[i] = (char) (ch[i] + 'a' - 'A');  
		}
		String st = new String(ch);
		return st;
	}
}
