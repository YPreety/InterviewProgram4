package Programming;

/*String Interning is a method of storing only one copy of each distinct String Value, which must be immutable.
By applying String.intern() on a couple of strings will ensure that all strings having same contents share same memory.

intern() method : In Java, when we perform any operation using intern() method, it returns a canonical representation for
the string object. A pool is managed by String class.

When the intern() method is executed then it checks whether the String equals to this String Object is in the pool or not.
If it is available, then the string from the pool is returned. Otherwise, this String object is added to the pool and a 
reference to this String object is returned.
It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
In the java programming language, intern() is a method present in String class which is present in java.lang package. 
By the help of intern() method, we can get the reference of corresponding String constant pool object of an original object.*/

public class String_Interning_Method {

	public static void main(String[] args) {
		String s1 = new String("GFG"); // Line-1
		String s2 = s1.intern(); // Line-2
		System.out.println(s1 == s2); // false
		String s3 = "GFG"; // Line-3
		System.out.println(s2 == s3); // true
	}
}
