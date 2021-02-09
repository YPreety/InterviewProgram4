package Programming;

import java.util.HashSet;
import java.util.Set;

/*Importance of Hashcode method in Java:-
HashMap and HashSet use hashing to manipulate data. They use hashCode() method to check hash values. 
The default implementation of hashCode() in Object class returns distinct integers for different objects.*/

public class Hashcode_Method_In_Java_Without_HashCode {

	private final String first, last;

	public static void main(String[] args) {
		Set<Hashcode_Method_In_Java_Without_HashCode> s = new HashSet<Hashcode_Method_In_Java_Without_HashCode>();
		s.add(new Hashcode_Method_In_Java_Without_HashCode("Shubham", "Juneja"));
		System.out.println(s.contains(new Hashcode_Method_In_Java_Without_HashCode("Shubham", "Juneja")));

	}

	public Hashcode_Method_In_Java_Without_HashCode(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Hashcode_Method_In_Java_Without_HashCode))
			return false;
		Hashcode_Method_In_Java_Without_HashCode n = (Hashcode_Method_In_Java_Without_HashCode) o;
		return n.first.equals(first) && n.last.equals(last);
	}
}
