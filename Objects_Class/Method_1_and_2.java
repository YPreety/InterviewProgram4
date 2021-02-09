package Objects_Class;

import java.util.Objects;

/*class Objects that have 9 static utility methods for operating on objects. 
These utilities include null-safe methods for computing the hash code of an object, returning a string for an object, 
and comparing two objects.

1. String toString(Object o) : This method returns the result of calling toString() method for a non-null argument and “null” for a null argument.
Syntax : public static String toString(Object o)
Parameters : o - an object
Returns : the result of calling toString() method for a non-null argument and "null" for a null argument

2. String toString(Object o, String nullDefault) : This method is overloaded version of above method. It returns the result of calling toString() method on the first argument if the first argument is not null and returns the second argument otherwise.
Syntax : public static String toString(Object o, String nullDefault)
Parameters : o - an object and nullDefault - string to return if the first argument is null
Returns :the result of calling toString() method on the first argument if it is not null and the second argument otherwise.*/

public class Method_1_and_2 {

	public static void main(String[] args) {
		Pair<String, String> p1 = new Pair<String, String>("GFG", "geeksforgeeks.org");
		Pair<String, String> p2 = new Pair<String, String>("Code", null);

		System.out.println(p1);  //Pair {key = GFG, value = geeksforgeeks.org}
		System.out.println(p2);  //Pair {key = Code, value = no value}

	}

}

class Pair<K, V> {
	public K key;
	public V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Pair {key = " + Objects.toString(key) + ", value = " + Objects.toString(value, "no value") + "}";
	}
}
