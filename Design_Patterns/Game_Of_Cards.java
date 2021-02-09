package Design_Patterns;

import java.util.LinkedList;

//the game of cards where the individuals can peek the first or last element of the deck on asking which element 
//they want to see.

public class Game_Of_Cards {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// adding elements in deck
		list.add(5);
		list.add(4);
		list.add("Jack");
		list.add(8);
		list.add("King");

		// printing the list
		System.out.println("The initial deck is :" + list); //[5, 4, Jack, 8, King]

		String d = "upper";

		System.out.println("The element chosen to peek is : " + d); //upper

		if (d == "upper")
			System.out.println("The Upper element is : " + list.peekFirst()); //5
		else
			System.out.println("The Lower element is : " + list.peekLast());

	}

}
