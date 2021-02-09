package Objects_Class;

import java.util.Objects;

/*3. boolean equals(Object a,Object b) : This method true if the arguments are equal to each other and false otherwise. 
Consequently, if both arguments are null, true is returned and if exactly one argument is null, false is returned. 
Otherwise, equality is determined by using the equals() method of the first argument.
Syntax : public static boolean equals(Object a,Object b)
Parameters : 
a - an object
b - an object to be compared with a for equality
Returns : true if the arguments are equal to each other and false otherwise*/

public class Method_3 {

	public static void main(String[] args) {
		Pair1<String, String> p1 = new Pair1<String, String>("GFG", "geeksforgeeks.org");

		Pair1<String, String> p2 = new Pair1<String, String>("GFG", "geeksforgeeks.org");

		Pair1<String, String> p3 = new Pair1<String, String>("GFG", "www.geeksforgeeks.org");

		System.out.println(p1.equals(p2)); //true
		System.out.println(p2.equals(p3)); //false

	}

}

class Pair1<K, V> {
	public K key;
	public V value;

	public Pair1(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Pair1)) {
			return false;
		}
		Pair1<?, ?> p = (Pair1<?, ?>) o;
		return Objects.equals(p.key, key) && Objects.equals(p.value, value);

	}
}
