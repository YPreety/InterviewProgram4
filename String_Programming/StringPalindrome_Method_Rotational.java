package String_Programming;

import java.util.Scanner;

public class StringPalindrome_Method_Rotational {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = r.next();
		boolean out = isRotationalPalindrom(str);
		System.out.println(out);
	}

	public static boolean isRotationalPalindrom(String str) {
		char a[] = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			rotateString(a);
			if (isPalindrom(a)) {
				System.out.println(str + " " + String.valueOf(a));
				return true;
			}
		}
		return false;
	}

	public static void rotateString(char[] arr) {
		char temp = arr[0];
		int i = 0;
		for (i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	public static boolean isPalindrom(char[] arr) {
		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			if (arr[i] != arr[j]) {
				return false;
			}
		}
		return true;
	}
}
