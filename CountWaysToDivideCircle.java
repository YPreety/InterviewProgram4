package Programming;

/*Count ways to divide circle using N non-intersecting chords
Given a number N, find the number of ways you can draw N chords in a circle with 2*N points such that no 2 chords intersect.
Input : N = 2
Output : 2
Explanation: If points are numbered 1 to 4 in 
clockwise direction, then different ways to 
draw chords are:
{(1-2), (3-4)} and {(1-4), (2-3)}


Input : N = 1
Output : 1
Explanation: Draw a chord between points 1 and 2.*/

public class CountWaysToDivideCircle {

	public static void main(String[] args) {
		int N;
		N = 2;
		System.out.println(chordCnt(N));
		N = 1;
		System.out.println(chordCnt(N));
		N = 4;
		System.out.println(chordCnt(N));
	}

	static int chordCnt(int A) {
		int n = 2 * A;
		int[] dpArray = new int[n + 1];
		dpArray[0] = 1;
		dpArray[2] = 1;
		for (int i = 4; i <= n; i += 2) {
			for (int j = 0; j < i - 1; j += 2) {
				dpArray[i] += (dpArray[j] * dpArray[i - 2 - j]);
			}
		}
		return dpArray[n];
	}
}
