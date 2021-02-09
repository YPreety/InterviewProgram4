package Programming;

import java.util.Arrays;

/*1.Whenever we use default implementation of clone method we get shallow copy of object means it creates new instance and copies 
all the field of object to that new instance and returns it as object type, we need to explicitly cast it back to our original 
object. This is shallow copy of the object.

2.clone() method of the object class support shallow copy of the object. If the object contains primitive as well as nonprimitive 
or reference type variable in shallow copy, the cloned object also refers to the same object to which the original object refers 
as only the object references gets copied and not the referred objects themselves.

3.That’s why the name shallow copy or shallow cloning in Java. If only primitive type fields or Immutable objects are there then 
there is no difference between shallow and deep copy in Java.*/

public class ShallowCopy {

	public static void main(String[] args) {
		int[] vals = { 3, 7, 9 };
		Ex e = new Ex(vals);
		e.showData(); // prints out [3, 7, 9]
		vals[0] = 13;
		e.showData(); // prints out [13, 7, 9]

	}

}

class Ex {

	private int[] data;

	public Ex(int[] values) {
		data = values;
	}

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}