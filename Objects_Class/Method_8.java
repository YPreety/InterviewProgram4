package Objects_Class;

import java.util.Objects;

/*8.int hash(Object… values) : This method generates a hash code for a sequence of input values. The hash code is generated
as if all the input values were placed into an array, and that array were hashed by calling Arrays.hashCode(Object[]).
This method is useful for implementing Object.hashCode() on objects containing multiple fields.

Note: When a single object reference is supplied, the returned value does not equal the hash code of that object reference. 
This value can be computed by calling hashCode(Object).

Syntax : public static int hash(Object... values)
Parameters : values - the values to be hashed
Returns :a hash value of the sequence of input values*/

public class Method_8 {

	public static void main(String[] args) {
		Pair5<String, String> p1 = new Pair5<String, String>("GFG", "geeksforgeeks.org");
		Pair5<String, String> p2 = new Pair5<String, String>("Code", null);
		Pair5<String, String> p3 = new Pair5<String, String>(null, null);

		System.out.println(p1.hashCode()); //453150372
		System.out.println(p2.hashCode()); // 65282900
		System.out.println(p3.hashCode()); //961

	}

}

class Pair5<K, V> {
	public K key;
	public V value;

	public Pair5(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public int hashCode() {
		return (Objects.hash(key, value));
	}
}
