package Objects_Class;

import java.util.Objects;

/*7. int hashCode(Object o) : This method returns the hash code of a non-null argument and 0 for a null argument.
Syntax : public static int hashCode(Object o)
Parameters : o - an object
Returns :the hash code of a non-null argument and 0 for a null argument*/

public class Method_7 {

	public static void main(String[] args) {
		Pair4<String, String> p1 = new Pair4<String, String>("GFG", "geeksforgeeks.org");
		Pair4<String, String> p2 = new Pair4<String, String>("Code", null);
		Pair4<String, String> p3 = new Pair4<String, String>(null, null);

		System.out.println(p1.hashCode()); //450903651
		System.out.println(p2.hashCode()); // 2105869
		System.out.println(p3.hashCode());  //0

	}

}

class Pair4<K, V> {
	public K key;
	public V value;

	public Pair4(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public int hashCode() {
		return (Objects.hashCode(key) ^ Objects.hashCode(value));
	}
}