package Programming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*Helper Class is a Java class which includes basic error handling, some helper functions etc. 
Helper class contains functions that help in assisting the program. This Class intends to give quick implementation of basic 
functions such that programmers do not have to implement again and again. It is easy to Access as all the member functions 
are static that is it can be accessed from anywhere. It implements the most commonly used functions excluding the functions 
that are already present in java library.*/

public class HelperClass {

	public static void main(String[] args) {
		int n = -5;
		if (Test.isValidInteger(n))
			System.out.println("True");
		else
			System.out.println("False");

		String str = "madam";
		if (Test.isPalindrome(str))
			System.out.println("True");
		else
			System.out.println("False");

	}

}

class Test {

	public static boolean isValidInteger(int test) {
		return (test >= 0);
	}

	public static boolean isValidInteger(int test, int low, int high) {
		return (test >= low && test <= high);
	}

	public static int getInRange(int low) {
		Scanner sc = new Scanner(System.in);
		int test;
		do {
			test = sc.nextInt();
		} while (test < low);

		return test;
	}

	public static int getInRange(int low, int high) {
		Scanner sc = new Scanner(System.in);
		int test;
		do {
			test = sc.nextInt();
		} while (test < low || test > high);
		return test;
	}

	public static boolean validatePositiveArray(int[] array, int n) {
		for (int i = 0; i < n; i++)
			if (array[i] < 0)
				return false;
		return true;
	}

	public static boolean validateNegativeArray(int[] array, int n) {
		for (int i = 0; i < n; i++)
			if (array[i] > 0)
				return false;
		return true;
	}

	public static boolean checkRangeArray(int[] array, int n, int low) {
		for (int i = 0; i < n; i++)
			if (array[i] < low)
				return false;
		return true;
	}

	public static boolean checkRangeArray(int[] array, int n, int low, int high) {
		for (int i = 0; i < n; i++)
			if (array[i] < low || array[i] > high)
				return false;
		return true;
	}

	public static boolean isEqualSets(int[] array1, int n, int[] array2, int m) {
		if (n != m)
			return false;
		HashMap<Integer, Integer> Map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++)
			Map.put(new Integer(array1[i]), new Integer(1));
		for (int i = 0; i < m; i++)
			Map.put(new Integer(array2[i]), new Integer(0));

		for (int i = 0; i < n; i++)
			if (Map.get(array1[i]) == 1)
				return false;
		return true;
	}

	public static String factorial(int n) {
		String fact = new String("");
		int res[] = new int[500];

		res[0] = 1;
		int res_size = 1;

		for (int x = 2; x <= n; x++)
			res_size = multiply(x, res, res_size);

		for (int i = res_size - 1; i >= 0; i--)
			fact += Integer.toString(res[i]);

		return fact;
	}

	public static int multiply(int x, int res[], int res_size) {
		int carry = 0;
		for (int i = 0; i < res_size; i++) {
			int prod = res[i] * x + carry;
			res[i] = prod % 10;
			carry = prod / 10;
		}
		while (carry != 0) {
			res[res_size] = carry % 10;
			carry = carry / 10;
			res_size++;
		}
		return res_size;
	}

	public static boolean isPrime(int n) {
		if (n == 2)
			return true;

		int squareRoot = (int) Math.sqrt(n);
		for (int i = 1; i <= squareRoot; i++)
			if (n % i == 0 && i != 1)
				return false;
		return true;
	}

	public static int nthPrimeNumber(int n) {
		int k = 0;
		for (int i = 2;; i++) {
			if (isPrime(i))
				k++;
			if (k == n)
				return i;
		}
	}

	public static boolean isPalindrome(String test) {
		int length = test.length();
		for (int i = 0; i <= (test.length()) / 2; i++)
			if (test.charAt(i) != test.charAt(length - i - 1))
				return false;
		return true;
	}

	public static boolean isAnagram(String s1, String s2) {

		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");

		if (copyOfs1.length() != copyOfs2.length())
			return false;

		char[] s1Array = copyOfs1.toLowerCase().toCharArray();
		char[] s2Array = copyOfs2.toLowerCase().toCharArray();

		Arrays.sort(s1Array);
		Arrays.sort(s2Array);

		return (Arrays.equals(s1Array, s2Array));
	}
}
