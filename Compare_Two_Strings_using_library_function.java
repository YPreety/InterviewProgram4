package Programming;

/*The method compareTo() is used for comparing two strings lexicographically in Java. Each character of both the strings is 
converted into a Unicode value for comparison.

int compareTo(String str) : 
It returns the following values:

1.if (string1 > string2) it returns a positive value.
2.if both the strings are equal lexicographically i.e.(string1 == string2) it returns 0.
3. if (string1 < string2) it returns a negative value.*/

public class Compare_Two_Strings_using_library_function {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Ram";
		String s3 = "Shyam";
		String s4 = "ABC";

		System.out.println(" Comparing strings with compareto:");
		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s3)); //-1 
		System.out.println(s1.compareTo(s4)); //17
	}
}
