package Design_Patterns;

/*Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the 
first 11 ugly numbers. By convention, 1 is included.
Input  : n = 7
Output : 8

Input  : n = 10
Output : 12

Input  : n = 15
Output : 24

Input  : n = 150
Output : 5832*/

public class Ugly_Numbers_Simple {

	public static void main(String[] args) {
		Ugly_Numbers_Simple obj = new Ugly_Numbers_Simple();
		int no = obj.getNthUglyNo(150);
		System.out.println("150th ugly no. is " + no);

	}

	int getNthUglyNo(int n) {
		int i = 1;
		int count = 1; // ugly number count

		// check for all integers until count becomes n */
		while (n > count) {
			i++;
			if (isUgly(i) == 1)
				count++;
		}
		return i;
	}

	int isUgly(int no) {
		no = maxDivide(no, 2);
		no = maxDivide(no, 3);
		no = maxDivide(no, 5);

		return (no == 1) ? 1 : 0;
	}

	int maxDivide(int a, int b) {
		while (a % b == 0)
			a = a / b;
		return a;
	}

}
