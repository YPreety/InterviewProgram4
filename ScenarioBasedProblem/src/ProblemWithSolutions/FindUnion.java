package ProblemWithSolutions;

import java.util.HashSet;

/*Let’s say you have two input arrays with sorted elements. 
Find the union.  a[] = {2, 10, 14, 19, 51, 71}   b[] = {2, 9, 19, 40, 51}   Union = {2, 9, 10, 14, 19, 40, 51}
*/
public class FindUnion {

	public static void main(String[] args) {
		int a[] = { 2, 10, 14, 19, 51, 71 };
		int b[] = { 2, 9, 19, 40, 51 };
		System.out.println("Union of two arrays is : ");
		findUnion(a, b);
	}

	private static void findUnion(int[] firstArr, int[] secondArr) {
		int i = 0;
		int j = 0;
		while (i < firstArr.length && j < secondArr.length) {
			if (firstArr[i] < secondArr[j]) {
				System.out.print(firstArr[i] + " ");
				i++;
			} else if (secondArr[j] < firstArr[i]) {
				System.out.print(secondArr[j] + " ");
				j++;
			} else {
				System.out.print(firstArr[i] + " ");
				i++;
				j++;
			}
		}
		while (i < firstArr.length) {
			System.out.print(firstArr[i] + " ");
			i++;
		}
		while (j < secondArr.length) {
			System.out.print(secondArr[j] + " ");
			j++;
		}
	}

}
