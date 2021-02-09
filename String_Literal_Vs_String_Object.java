package Programming;

/*String Literal :-  String str = “GeeksForGeeks”;
This method references internal pool of string objects. If there already exists a string value “GeeksForGeeks”, 
then str will reference of that string and no new String object will be created. 

String Object :- String str = new String(“GeeksForGeeks”);
In this method JVM is forced to create a new string reference, even if “GeeksForGeeks” is in the reference pool.

if we compare performance of string literal and string object, string object will always take more time to execute than
string literal because it will construct a new string every time it is executed.*/

public class String_Literal_Vs_String_Object {

	public static void main(String[] args) {
		long start1 = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			String s1 = "GeeksForGeeks";
			String s2 = "Welcome";
		}
		long end1 = System.currentTimeMillis();
		long total_time = end1 - start1;
		System.out.println("Time taken to execute" + " string literal = " + total_time);
		long start2 = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			String s3 = new String("GeeksForGeeks");
			String s4 = new String("Welcome");
		}
		long end2 = System.currentTimeMillis();
		long total_time1 = end2 - start2;
		System.out.println("Time taken to execute" + " string object=" + total_time1);
	}
}
