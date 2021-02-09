package Programming;

/*Efficient program to print all prime factors of a given number
if the input number is 12, then output should be “2 2 3”. And if the input number is 315, then output should be “3 3 5 7”.*/

public class print_all_prime_factors {

	public static void main(String[] args) {
		int n = 315;
		primeFactors(n);
	}

	public static void primeFactors(int n) {
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
		if (n > 2)
			System.out.print(n);
	}
}
