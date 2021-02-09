package Design_Patterns;

import java.util.NavigableMap;
import java.util.TreeMap;

//priority scheduling, or designing a ranking system.

public class Designing_Ranking_System {

	public static void main(String[] args) {
		TreeMap<Integer, String> participants = new TreeMap<Integer, String>();

		participants.put(30, "Ashty");
		participants.put(45, "Shavi");
		participants.put(16, "Vaish");
		participants.put(15, "Kil");
		participants.put(11, "Manju");

		// putting ranks in NavigableMap use of descendingMap() to assign 1st to maximum values and so on
		NavigableMap<Integer, String> Ranks = participants.descendingMap();

		System.out.println("The ranks according to scores are : ");

		// Printing values rankwise
		int count = 0;
		for (NavigableMap.Entry<Integer, String> entry : Ranks.entrySet()) {
			count++;
			String str = Integer.toString(count);
			System.out.println("Rank " + str + ": " + entry.getValue());
		}

	}

}
