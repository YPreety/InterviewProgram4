package Programming;

import java.util.Arrays;

/*1.Whenever we need own copy not to use default implementation we call it as deep copy, whenever we need deep copy of the object we
need to implement according to our need.

2.So for deep copy we need to ensure all the member class also implement the Cloneable interface and override the clone() method 
of the object class.*/

public class DeepCopy {

	public static void main(String[] args) {
		int[] vals = { 3, 7, 9 };
		Ex1 e = new Ex1(vals);
		e.showData(); // prints out [3, 7, 9]
		vals[0] = 13;
		e.showData(); // prints out [3, 7, 9]

	}

}

class Ex1 {

	private int[] data;

	public Ex1(int[] values) {
		data = new int[values.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = values[i];
		}
	}

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}