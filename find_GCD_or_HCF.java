package Programming;

/*Program to find GCD or HCF of two numbers
GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number that divides both of them.
For example GCD of 20 and 28 is 4 and GCD of 98 and 56 is 14.*/

public class find_GCD_or_HCF {

	public static void main(String[] args) {
		int a = 98, b = 56;
		System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
	}

	static int gcd(int a, int b) {
		if (a == 0 || b == 0)
			return 0;
		if (a == b)
			return a;
		if (a > b)
			return gcd(a - b, b);
		return gcd(a, b - a);
	}
}
