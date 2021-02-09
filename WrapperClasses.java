package Programming;

/*Utility methods of Wrapper classes:-
1. valueOf() method:-We can use valueOf() method to create Wrapper object for given primitive or String.
There are 3 types of valueOf() methods:
	a.Wrapper valueOf(String s):-Every wrapper class except Character class contains a static valueOf() method to create 
	Wrapper class object for given String.
	Syntax: public static Wrapper valueOf(String s);
	
	b.Wrapper valueOf(String s, int radix):-Every Integral Wrapper class Byte, Short, Integer, Long) contains the following 
valueOf() method to create a Wrapper object for the given String with specified radix. The range of the radix is 2 to 36.
	Syntax: public static Wrapper valueOf(String s, int radix)
	
	c.Wrapper valueOf(primitive p):- Every Wrapper class including Character class contains the following method to create 
	a Wrapper object for the given primitive type.
	Syntax:	public static Wrapper valueOf(primitive p);
	
2. xxxValue() method:- We can use xxxValue() methods to get the primitive for the given Wrapper Object.Every number type 
Wrapper class( Byte, Short, Integer, Long, Float, Double) contains the following 6 methods to get primitive for the given 
Wrapper object:
	public byte byteValue()
	public short shortValue()
	public int intValue()
	public long longValue()
	public float floatValue()
	public float doubleValue()

3.parseXxx() method:- We can use parseXxx() methods to convert String to primitive. There are two types of parseXxx() 
methods:
	a.primitive parseXxx(String s):- Every Wrapper class except character class contains the following parseXxx() method 
	to find primitive for the given String object.
	Syntax:	public static primitive parseXxx(String s);
	
	b.parseXxx(String s, int radix)- Every Integral type Wrapper class (Byte, Short, Integer, Long) contains the 
	following parseXxx() method to convert specified radix String to primitive.
	Syntax:public static primitive parseXxx(String s, int radix);
	
4.toString() method:- We can use toString() method to convert Wrapper object or primitive to String. 
There are few forms of toString() method:
	a.public String toString():-Every wrapper class contains the following toString() method to convert Wrapper Object to String type.
	Syntax:public String toString();
	
	b.toString(primitive p):-Every Wrapper class including Character class contains the following static toString() method 
	to convert primitive to String.
	Syntax:public static String toString(primitive p);
	
	c.toString(primitive p, int radix):-Integer and Long classes contains the following toString() method to convert primitve to specified radix String.
	Syntax:public static String toString(primitive p, int radix);*/
	
public class WrapperClasses {

	public static void main(String[] args) {
		Integer I = Integer.valueOf("10");  // Wrapper valueOf(String s)
        System.out.println(I);
        //Integer I1 = Integer.valueOf("ten"); //Wrapper valueOf(String s)
        //System.out.println(I1);  // output :-  Exception in thread "main" java.lang.NumberFormatException: For input string: "ten"
        Integer I2 = Integer.valueOf("1111", 2); //Wrapper valueOf(String s, int radix)
        System.out.println(I2);
        Integer I3 = Integer.valueOf(10); //Wrapper valueOf(primitive p)
        
        System.out.println(I3);
        Integer I4 = new Integer(130);  //xxxValue() method
        System.out.println(I4.byteValue());
    
        int i = Integer.parseInt("10");  //primitive parseXxx(String s)
        System.out.println(i);
        double d = Double.parseDouble("10.5");   //primitive parseXxx(String s)
        System.out.println(d);
        boolean b = Boolean.parseBoolean("true");  //primitive parseXxx(String s)  
        System.out.println(b);
        
        int i1 = Integer.parseInt("1000", 2); //parseXxx(String s, int radix)
        System.out.println(i1);
        long l = Long.parseLong("1111", 4);  //parseXxx(String s, int radix) 
        System.out.println(l);
        
        Integer I5 = new Integer(10);  //String toString()
        String s = I5.toString();  //String toString()
        System.out.println(s);
        
        String s1 = Integer.toString(10);  //toString(primitive p)
        System.out.println(s1);
        String s2 = Character.toString('a'); //toString(primitive p)
        System.out.println(s2);
        
        String s3 = Integer.toString(15, 2);  //toString(primitive p, int radix)
        System.out.println(s3);
        String s4 = Long.toString(11110000, 4); //toString(primitive p, int radix)
        System.out.println(s4);
        
	}

}
