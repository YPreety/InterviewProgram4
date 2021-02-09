package Programming;

/*Sum of the products of all possible Subsets
Input : arr[] = {1, 2, 3}
Output : 23
Possible Subset are: 1, 2, 3, {1, 2}, {1, 3}, 
                     {2, 3}, {1, 2, 3}
Products of elements in above subsets :
1, 2, 3, 2, 3, 6, 6
Sum of all products = 1 + 2 + 3 + 2 + 3 + 6 + 6 
                    = 23
Time Complexity: O(n)
Auxiliary Space: O(1)*/
public class Sumoftheproducts {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int n = arr.length;
		System.out.println(productOfSubsetSums(arr, n));

	}

	static int productOfSubsetSums(int arr[], int n) {
		int ans = 1;
		for (int i = 0; i < n; ++i)
			ans = ans * (arr[i] + 1);
		return ans - 1;
	}

}
