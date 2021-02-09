package Programming;

/*Find if neat arrangement of cups and shelves can be made
Given three different types of cups (a[]) and saucers (b[]), and n number of shelves, 
find if neat arrangement of cups and shelves can be made.
Arrangement of the cups and saucers will be neat if it follows the below rules:

No shelf can contain both cups and saucers
There can be no more than 5 cups in any shelf
There can be no more than 10 saucers in any shelf

Input : a[] = {3, 2, 6}
b[] = {4, 8, 9}
n = 10
Output : Yes
Explanation :  
Total cups = 11, shelves required = 3
Total saucers = 21, shelves required = 3
Total required shelves = 3 + 3 = 6, 
which is less than given number of 
shelves n. So, output is Yes.

Input : a[] = {4, 7, 4}
b[] = {3, 9, 10}
n = 2
Output : No*/

public class NeatArrangementOfCups {

	public static void main(String[] args) {
		int a[] = { 3, 2, 6 };
		int b[] = { 4, 8, 9 };
		int n = 10;
		canArrange(a, b, n);
	}

	public static void canArrange(int a[], int b[], int n) {
		int suma = 0, sumb = 0;
		for (int i = 0; i < 2; i++)
			suma += a[i];
		for (int i = 0; i < 2; i++)
			sumb += b[i];
		int na = (suma + 5 - 1) / 5;
		int nb = (sumb + 10 - 1) / 10;
		if (na + nb <= n)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
