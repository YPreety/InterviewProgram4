package Programming;

//Time Complexity: O(n)

public class PrintAllDuplicates {

	static final int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		String str = "test string";
		printDups(str);
	}

	static void printDups(String str) {
		int count[] = new int[NO_OF_CHARS];
		fillCharCounts(str, count);
		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] > 1)
				System.out.printf("%c,  count = %d \n", i, count[i]);
	}

	static void fillCharCounts(String str, int[] count) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}
}
