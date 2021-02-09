package Programming;

import java.util.Scanner;

public class NumberOrNot {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
        System.out.print("Enter a data: ");
        String input = r.next();
        boolean out = isNumberOrNot(input);
        System.out.println(out);
	}
	public static boolean isNumberOrNot(String input){
		try{
			Integer.parseInt(input);
		}catch(NumberFormatException  e){
			return false;
		}
		return true;
	}
}
