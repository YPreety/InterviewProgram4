package Design_Patterns;

import java.util.LinkedList;

///priority addition in queues where elements having a greater no. than 
//threshhold have to be handled before the elements lesser than that. 
public class Priority_Addition_In_Queues {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList prioList = new LinkedList();

		// adding elements
		list.add(12);
		list.add(4);
		list.add(8);
		list.add(10);
		list.add(3);
		list.add(15);

		// declaring threshhold
		int thres = 10;

		// printing the list
		System.out.println("The initial Linked list is : " + list); //[12, 4, 8, 10, 3, 15]

		while (!list.isEmpty()) {

			int t = list.poll();

			// adding >=10 numbers at front rest at back
			if (t >= 10)
				prioList.offerFirst(t);
			else
				prioList.offerLast(t);
		}

		// The resultant list is
		System.out.println("The prioritized Linked list is : " + prioList); //[15, 10, 12, 4, 8, 3]

	}

}
