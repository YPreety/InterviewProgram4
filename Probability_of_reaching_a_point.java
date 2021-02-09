package Programming;

/*Probability of reaching a point with 2 or 3 steps at a time
A person starts walking from position X = 0, find the probability to reach exactly on X = N if she can only take 
either 2 steps or 3 steps. Probability for step length 2 is given i.e. P, probability for step length 3 is 1 – P.

Input : N = 5, P = 0.20
Output : 0.32
Explanation :-
There are two ways to reach 5.
2+3 with probability = 0.2 * 0.8 = 0.16
3+2 with probability = 0.8 * 0.2 = 0.16
So, total probability = 0.32.*/

public class Probability_of_reaching_a_point {

	public static void main(String[] args) {
		int n = 5;
		float p = 0.2f;
		System.out.printf("%.2f", find_prob(n, p));
	}

	static float find_prob(int N, float P) {
		double dp[] = new double[N + 1];
		dp[0] = 1;
		dp[1] = 0;
		dp[2] = P;
		dp[3] = 1 - P;
		for (int i = 4; i <= N; ++i)
			dp[i] = (P) * dp[i - 2] + (1 - P) * dp[i - 3];
		return ((float) (dp[N]));
	}
}
