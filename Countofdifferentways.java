package Programming;

/*Count of different ways to express N as the sum of 1, 3 and 4
Input :  N = 4
Output : 4 
Explanation: 1+1+1+1 
             1+3
             3+1 
             4 

Input : N = 5 
Output : 6
Explanation: 1 + 1 + 1 + 1 + 1
             1 + 4
             4 + 1
             1 + 1 + 3
             1 + 3 + 1
             3 + 1 + 1
Time Complexity : O(n)
Auxiliary Space : O(n)*/
public class Countofdifferentways {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(countWays(n));
	}

	static int countWays(int n) {
		int DP[] = new int[n + 1];
		DP[0] = DP[1] = DP[2] = 1;
		DP[3] = 2;
		for (int i = 4; i <= n; i++)
			DP[i] = DP[i - 1] + DP[i - 3] + DP[i - 4];
		return DP[n];
	}
}
