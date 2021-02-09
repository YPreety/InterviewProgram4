package Programming;

import java.util.Map;
import java.util.TreeMap;

/*Print number of words, vowels and frequency of each character
Input : How Good GOD Is.

Output : 
Number of words = 4
Number of vowels = 5
Number of upper case characters = 6
Character =   Frequency = 3
Character = . Frequency = 1
Character = D Frequency = 1
Character = G Frequency = 2
Character = H Frequency = 1
Character = I Frequency = 1
Character = O Frequency = 1
Character = d Frequency = 1
Character = o Frequency = 3
Character = s Frequency = 1
Character = w Frequency = 1

Time Complexity : O(n), where n is the number of characters in the string.
Auxiliary Space : O(1).*/

public class Print_Number_Of_Words_Vowels_And_Frequency {

	String str = "Geeks for Geeks.";

	public static void main(String[] args) {
		Print_Number_Of_Words_Vowels_And_Frequency obj =  new Print_Number_Of_Words_Vowels_And_Frequency();
		obj.words();
		obj.frequency();
	}

	void words() {
		int wCount = 0, uCount = 0, vCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
			case ' ':
			case '.':
				wCount++; 
			}
			switch (c) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vCount++;
			}

			if (c >= 65 && c <= 90) {
				uCount++;
			}
		}
		System.out.println("Number of words = " + wCount);
		System.out.println("Number of vowels = " + vCount);
		System.out.println("Number of upper case characters = " + uCount);
	}

	void frequency() {
		TreeMap<Character, Integer> hmap = new TreeMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Integer c = hmap.get(str.charAt(i));
			if (hmap.get(str.charAt(i)) == null)
				hmap.put(str.charAt(i), 1);
			else
				hmap.put(str.charAt(i), ++c);
		}
		for (Map.Entry m : hmap.entrySet())
			System.out.println("Character = " + m.getKey() + " Frequency = " + m.getValue());
	}
}
