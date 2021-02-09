package Programming;

/*Blank final variable : A final variable declared but not assigned is known as a blank final variable. 
It can be initialized within a constructor only. It raises compilation error if it is not initialized because 
it should be given a value somewhere in the program and that too from a constructor only.

Static blank final variable : It is a blank final variable declared as static. That is, a final static variable 
declared but not given a value or not initialized is known as static blank final variable.It can be initialized 
through a static block only.*/

public class Static_blank_final_variable {

	private static final int a;
	private final int b;
	static {
		a = 1;
	}

	Static_blank_final_variable(int c) {
		b = c;
	}

	public static void main(String[] args) {
		Static_blank_final_variable g1 = new Static_blank_final_variable(10);
		Static_blank_final_variable g2 = new Static_blank_final_variable(20);
		System.out.println(Static_blank_final_variable.a); // 1
		System.out.println(g1.b); // 10
		System.out.println(g1.b); // 10

	}

}
