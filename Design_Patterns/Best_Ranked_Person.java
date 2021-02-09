package Design_Patterns;

import java.util.TreeMap;

/*best ranked person in given list, or can be used to assign winner in game in which person with lowest time to finish a 
task wins.*/

public class Best_Ranked_Person {

	public static void main(String[] args) {
		TreeMap<Float, String> time = new TreeMap<Float, String>();

		// assigning the time taken to complete task
		// using put()
		time.put(2.32f, "Astha");
		time.put(7.43f, "Manjeet");
		time.put(1.3f, "Shambhavi");
		time.put(5.63f, "Nikhil");
		time.put(6.26f, "Vaishnavi");

		// use of firstEntry()
		// printing person with least time
		System.out.println("Winner with lowest time is : " + time.firstEntry());

	}

}
