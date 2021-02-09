package Programming;

/*An enum can contain constants, methods etc. enum can be defined as a group of named constant.
There are two ways for making comparison of enum members:

By using == operator
By using equals() method

1. == operator never throws NullPointerException whereas .equals() method can throw NullPointerException.
2. == is responsible for type compatibility check at compile time whereas .
   equals() method will never worry about the types of both the arguments.*/

public class Comparing_Enum_Members {

	public enum Day {
		MON, TUE, WED, THU, FRI, SAT, SUN
	}

	public static void main(String[] args) {
		Day d = null;
		System.out.println(d == Day.MON);   //false
		System.out.println(d.equals(Day.MON));    // Null pointer exception
	}
}
