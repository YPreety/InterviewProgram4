package Programming;

import java.util.HashSet;
import java.util.Set;

public class Set_To_Array_toArrayFun {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Geeks");
		s.add("for");
		int n = s.size();
		String arr[] = new String[n];
		arr = s.toArray(arr);

		for (String x : arr)
			System.out.println(x);

	}

}
