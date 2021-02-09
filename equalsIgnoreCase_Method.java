package Programming;

/*The equalsIgnoreCase() method compares two strings irrespective of the case (lower or upper) of the string. 
This method returns true if the argument is not null and it represents an equivalent String ignoring case, else false.

Input : str1 = "pAwAn";
str2 = "PAWan"
str2.equalsIgnoreCase(str1);
Output :true

Input : str1 = "powAn";
str2 = "PAWan"
str2.equalsIgnoreCase(str1);
Output :false
Explenation: powan and pawan are different strings. */


public class equalsIgnoreCase_Method {

	public static void main(String[] args) {
		String str1 = "GeeKS FOr gEEks";
	    String str2 = "geeKs foR gEEKs";
	    String str3 = "ksgee orF geeks";
	 
	    // if we ignore the cases both the strings are equal.
	    boolean result1 = str2.equalsIgnoreCase(str1);
	    System.out.println("str2 is equal to str1 = " + result1);
	 
	    // even if ignoring the cases both the strings are not equal.
	    boolean result2 = str2.equalsIgnoreCase(str3);
	    System.out.println("str2 is equal to str3 = " + result2);

	}

}
