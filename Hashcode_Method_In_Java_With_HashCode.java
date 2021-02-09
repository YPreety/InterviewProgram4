package Programming;

import java.util.HashSet;
import java.util.Set;

public class Hashcode_Method_In_Java_With_HashCode {

	private final String first, last;

	public static void main(String[] args) {
		Set<Hashcode_Method_In_Java_With_HashCode> s = new HashSet<Hashcode_Method_In_Java_With_HashCode>();
		s.add(new Hashcode_Method_In_Java_With_HashCode("Shubham", "Juneja"));
		System.out.println(s.contains(new Hashcode_Method_In_Java_With_HashCode("Shubham", "Juneja")));

	}

	public Hashcode_Method_In_Java_With_HashCode(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Hashcode_Method_In_Java_With_HashCode))
			return false;
		Hashcode_Method_In_Java_With_HashCode n = (Hashcode_Method_In_Java_With_HashCode) o;
		return n.first.equals(first) && n.last.equals(last);
	}

	public int hashCode() {
		return 63 * first.hashCode() + last.hashCode();
	}
}
