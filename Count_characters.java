package Programming;

/*Count characters at same position as in English alphabets
Input:  ABcED 
Output :  3

Input:  geeksforgeeks 
Output :  1

Input :  alphabetical 
Output :  3*/
public class Count_characters {

	public static void main(String[] args) {
		String str = "AbgdiF";
		System.out.println(findCount(str));
	}

	static int findCount(String str) {
		int result = 0;
		char[] c = str.toCharArray();
		for (int i = 0; i <c.length; i++)
			if (i == (c[i]- 'a') || i == (c[i] - 'A'))
				result++;
		return result;
	}
}
