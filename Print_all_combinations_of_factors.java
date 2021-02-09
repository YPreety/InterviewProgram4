package Programming;

import java.util.ArrayList;
import java.util.List;

/*Print all combinations of factors (Ways to factorize)

Write a program to print all the combinations of factors of given number n.

Input : 16
Output :2 2 2 2 
        2 2 4 
        2 8 
        4 4 

Input : 12
Output : 2 2 3
         2 6
         3 4*/

public class Print_all_combinations_of_factors {

	public static void main(String[] args) {
		int n = 16;
		List<List<Integer>> resultant = factComb(n);
		for (List<Integer> i : resultant) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> factComb(int n) {
		List<List<Integer>> result_list = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		factorsListFunc(2, 1, n, result_list, list);
		return result_list;
	}

	public static void factorsListFunc(int first, int each_prod, int n, List<List<Integer>> result_list,
			List<Integer> single_result_list) {
		if (first > n || each_prod > n)
			return;
		if (each_prod == n) {

			ArrayList<Integer> t = new ArrayList<Integer>(single_result_list);

			result_list.add(t);

			return;
		}
		for (int i = first; i < n; i++) {
			if (i * each_prod > n)
				break;
			if (n % i == 0) {
				single_result_list.add(i);
				factorsListFunc(i, i * each_prod, n, result_list, single_result_list);
				single_result_list.remove(single_result_list.size() - 1);
			}
		}
	}

}
