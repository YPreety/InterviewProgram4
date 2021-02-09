package Programming;

import java.util.HashSet;
import java.util.Set;

/*Given a set (HashSet or TreeSet) of strings in Java, convert it into an array of strings.

Input : Set hash_Set = new HashSet();
hash_Set.add("Geeks");
hash_Set.add("For");
Output : String arr[] = {"Geeks", "for"}*/

public class Set_To_Array_Simple {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Geeks");
		s.add("for");
		int n = s.size();
		String arr[] = new String[n];
		int i = 0;
		for (String x : s)
			arr[i++] = x;
		for (String x : arr)
			System.out.println(x);
	}
}
