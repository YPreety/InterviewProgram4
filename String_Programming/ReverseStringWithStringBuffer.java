package String_Programming;

public class ReverseStringWithStringBuffer {

	public static void main(String[] args) {
		String str ="abcde";
		StringBuffer sb = new StringBuffer(str);      
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+sb.reverse());
	}

}
