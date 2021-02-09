package Programming;

/*Input :5

Output :
********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5*****/

public class StarPattern {

	public static void main(String[] args) {
		int height = 7;
		StarPattern1(height);

	}

	public static void StarPattern1(int height) {
		for (int i = 0; i < height; i++) {
			for (int j = height - 1; j > i; j--) {
				System.out.print("*");
			}
			boolean printChar = false;
			for (int j = 0; j < ((i * 2) + 1); j++) {
				if (printChar) {
					System.out.print("*");
				} else {
					System.out.print(i + 1);
				}
				printChar = !printChar;
			}
			for (int j = height - 1; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
