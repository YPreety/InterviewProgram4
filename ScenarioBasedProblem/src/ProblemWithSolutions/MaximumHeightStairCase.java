package ProblemWithSolutions;

public class MaximumHeightStairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumHeightStairCase p = new MaximumHeightStairCase();
		System.out.println("10 : " + p.solve(10));
		System.out.println("12 : " + p.solve(12));
		System.out.println("16 : " + p.solve(16));
		System.out.println("20 : " + p.solve(20));
	}

	public int solve(int blocks) {
		int stairs = 0;
		while (blocks != 0) {
			if (stairs + 1 <= blocks) {
				stairs++;
				blocks = blocks - stairs;
			} else {
				break;
			}

		}

		return stairs;
	}
}
