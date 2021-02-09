package BitSet;

import java.util.BitSet;

/*1. flip(int value) : This method removes the value specified in the argument.

public void flip(int value)

Parameters : value :  the value to flip.
Return Value : This method does not return a value.
		
2. flip(int fromnum, int tonum) : This method sets each bit from the specified fromnum (inclusive) to the specified 
tonum (exclusive) to the complement of its current value, i.e removes fromnum to tonum-1 values.

public void flip(int fromnum,int tonum)
Parameters : 
  fromnum :  start number to begin flipping.
  tonum :  last-1 number to end flipping.
Return Value : This method does not return a value.*/

public class Flip {

	public static void main(String[] args) {
		BitSet bset = new BitSet(6);

		// assigning values to bset
		bset.set(0);
		bset.set(1);
		bset.set(2);
		bset.set(3);

		// printing the original set
		System.out.println("The original bitset is : " + bset);

		// using flip() to remove 2
		bset.flip(2);  //{0, 1 ,3} 

		// using flip(fromnum,tonum) to remove 1 and 2
		bset.flip(1, 3);   //{0, 3}

		// printing final bitset
		// 2 is removed
		System.out.println("The flipped bitset is : " + bset);

	}

}
