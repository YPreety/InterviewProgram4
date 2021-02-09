package Design_Patterns;

import java.util.LinkedList;

//“1st elimination” games
public class Queue_Management {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// adding queue entry of people
		// in order
		list.add("Astha");
		list.add("Shambhavi");
		list.add("Nikhil");
		list.add("Manjeet");

		// printing the list
		System.out.println("The initial queue is : " + list); //[Astha, Shambhavi, Nikhil, Manjeet]

		System.out.print("The order of exit is : ");

		while (!list.isEmpty()) {
			// using poll() to display the order of exit from queue
			System.out.print(list.poll() + " <-- "); //Astha <-- Shambhavi <-- Nikhil <-- Manjeet <-- 
		}

	}

}
