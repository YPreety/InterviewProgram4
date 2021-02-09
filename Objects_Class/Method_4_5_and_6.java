package Objects_Class;

import java.util.Objects;

/*4.boolean deepEquals(Object a,Object b) :This method returns true if the arguments are deeply equal to each other and 
false otherwise. Two null values are deeply equal. If both arguments are arrays, the algorithm in Arrays.deepEquals is 
used to determine equality. Otherwise, equality is determined by using the equals method of the first argument.
Syntax : public static boolean deepEquals(Object a,Object b)
Parameters : 
a - an object
b - an object to be compared with a for equality
Returns : true if the arguments are deeply equals to each other and false otherwise

5.T requireNonNull(T obj) : This method checks that the specified object reference is not null. This method is designed 
primarily for doing parameter validation in methods and constructors, as demonstrated in below example:
Syntax : public static  T requireNonNull(T obj)
Type Parameters: T - the type of the reference
Parameters : obj - the object reference to check for nullity
Returns : obj if not null
Throws: NullPointerException - if obj is null

6.T requireNonNull(T obj,String message) : This method is overloaded version of above method with customized message 
printing if obj is null as demonstrated in below example:
Syntax :public static  T requireNonNull(T obj,String message)
Type Parameters: T - the type of the reference
Parameters : obj - the object reference to check for nullity
message - detail message to be used in the event that a NullPointerException is thrown
Returns : obj if not null
Throws: NullPointerException - if obj is null*/

public class Method_4_5_and_6 {

	public static void main(String[] args) {
		Pair3<String, String> p1 = new Pair3<String, String>("GFG", "geeksforgeeks.org");

		p1.setKey("Geeks");

		// below statement will throw NPE with customized message
		p1.setValue(null);

	}

}

class Pair3<K, V> {
	public K key;
	public V value;

	public Pair3(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public void setKey(K key) {
		this.key = Objects.requireNonNull(key);
	}

	public void setValue(V value) {
		this.value = Objects.requireNonNull(value, "no value");
	}
}
