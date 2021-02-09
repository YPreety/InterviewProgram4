package Programming;

public class Final_Example {

	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("Hello");
        sb.append("GFG");
        System.out.println(sb); //HelloGFG
        sb = new StringBuffer("Hello World"); //Unresolved compilation problem.The final local variable sb cannot be assigned
        System.out.println(sb);
	}
}
