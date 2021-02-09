package Design_Patterns;

import java.util.LinkedList;

//compute no. of elements, persons etc that are coming in between the last and 1st occurrence of value.
public class Compute_Number_Of_Elements {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

        list.add(1);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(4);
        list.add(8);
 
        // printing the initial list
        System.out.println("The initial Linked List is : " + list); //[1, 4, 3, 6, 7, 4, 8]
 
        // computing result
        int res = list.lastIndexOf(4) - list.indexOf(4) - 1;
 
        // Printing the number of elements between 1st occurence of 4 and last 4 prints 3
        System.out.println("The no. between 4s are :  " + res); //3

	}

}
