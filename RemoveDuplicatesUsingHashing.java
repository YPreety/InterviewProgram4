package Programming;

import java.util.LinkedHashSet;

//Time Complexity: O(n)

public class RemoveDuplicatesUsingHashing {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		RemoveDuplicatesUsingHashing r = new RemoveDuplicatesUsingHashing();
		r.removeDuplicates(str);
	}

	void removeDuplicates(String str) {
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++)
			lhs.add(str.charAt(i));
		for (Character ch : lhs)
			System.out.print(ch);
	}
}
