package BitSet;

import java.util.BitSet;

/*1. boolean get( int value ) : Returns true if the value is present in Bitset, else returns false.

Declaration : public boolean get(int value)
Parameters : value : The value to check.
Return Value : Returns boolean true, if element present else returns false.

2. Bitset get(int fromval, int toval) : method returns a new BitSet composed of elements present in Bitset from fromvale (inclusive) to toval (exclusive).

Declaration : public BitSet get(int fromval, int toval)
Parameters : 
fromval :  first value to include.
toval : last value to include(ex).
Return Value : This method returns a new BitSet from a range of this BitSet.*/

public class Get {

	public static void main(String[] args) {
		BitSet bset = new BitSet(5);

		// adding values using set()
		bset.set(0);
		bset.set(1);
		bset.set(2);
		bset.set(4);

		// checking if 3 is in BitSet
		System.out.println("Does 3 exist in Bitset? : " + bset.get(3)); //false

		// Printing values in range 0-2
		System.out.println("Values in BitSet from 0-2 are : " + bset.get(0, 3)); //{0, 1, 2}

	}

}
