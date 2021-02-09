package BitSet;

import java.util.BitSet;

/*xor(BitSet set) : This method performs a logical XOR and returns those elements that are present in one bitset but not in 
other.

Declaration : public void xor(BitSet set)
Parameters :  set a bit set.
Return Value :  This method does not return a value.*/

public class logical_XOR {

	public static void main(String[] args) {
		BitSet bset1 = new BitSet(5);
		BitSet bset2 = new BitSet(5);

		// adding the values to bset1
		// using set()
		bset1.set(0);
		bset1.set(1);
		bset1.set(2);
		bset1.set(3);

		// adding the values to bset2
		// using set()
		bset2.set(2);
		bset2.set(4);
		bset2.set(6);
		bset2.set(0);

		// printing the initial sets
		System.out.println("The elements of Bitset 1 are : " + bset1); //{0, 1, 2, 3}

		System.out.println("The elements of Bitset 2 are : " + bset2); //{0, 2, 4, 6}

		// perform "xor" operation between two bitsets
		// using xor()
		bset1.xor(bset2);

		// printing the new bset1
		System.out.println("The resultant bset1 after xor operation is : " + bset1); // {1, 3, 4, 6}

	}

}
