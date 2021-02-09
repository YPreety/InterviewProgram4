package Programming;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = r.nextInt();
        boolean out = isPrimeNumber(n);
        System.out.println(out);
	}

	public static boolean isPrimeNumber(int n) {

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
