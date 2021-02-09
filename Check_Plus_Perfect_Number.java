package Programming;

/*Program to check Plus Perfect Number
Given a ‘n’ digit number x, check if it is a plus perfect number or not. A number is plus perfect number 
if it is equal to the sum of its digits raised to the nth power.

Input : x  = 371
Output : Yes
Explanation :  Number of digits n = 3
(3*3*3) + (7*7*7) + (1*1*1) = 371

Input : x = 9474
Output : Yes
Explanation : Number of digits n = 4
(9*9*9*9) + (4*4*4*4) + (7*7*7*7) + (4*4*4*4) = 9474

Input : x = 9473
Output : No
Explanation : Number of digits n = 4
(9*9*9*9) + (4*4*4*4) + (7*7*7*7) + (3*3*3*3) != 9474*/

public class Check_Plus_Perfect_Number {

	public static void main(String[] args) {
		int x = 9474;
		if (checkplusperfect(x))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	static boolean checkplusperfect(int x) {
		int temp = x;
		int n = 0;
		while (x != 0) {
			x /= 10;
			n++;
		}
		x = temp;
		int sum = 0;
		while (x != 0) {
			sum += Math.pow(x % 10, n);
			x /= 10;
		}
		return (sum == temp);
	}
}
