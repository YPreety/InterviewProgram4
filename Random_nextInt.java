package Programming;

import java.util.Random;

/*Java.util.Random.nextInt() in Java :-
1. java.util.Random.nextInt() : The nextInt() is used to get the next random integer value from this random number 
generator’s sequence.
Declaration : public int nextInt()
Parameters : NA
Return Value : The method call returns the next integer number from the sequence
Exception : NA

2. java.util.Random.nextInt(int n) : The nextInt(int n) is used to get a random number between 0(inclusive) and the number
passed in this argument(n), exclusive.
Declaration : public int nextInt(int n)
Parameters : n :  This is the bound on the random number to be returned. Must be positive.
Return Value : Returns a random number. between 0 (inclusive) and n (exclusive).
Exception : IllegalArgumentException :  This is thrown if n is not positive.*/

public class Random_nextInt {

	public static void main(String[] args) {
		Random ran = new Random();
		int nxt = ran.nextInt();
		System.out.println("The Randomly generated integer is : " + nxt);
		int nxt1 = ran.nextInt(10);
		System.out.println("Random number between 0 and 10 is : " + nxt1);
	}
}
