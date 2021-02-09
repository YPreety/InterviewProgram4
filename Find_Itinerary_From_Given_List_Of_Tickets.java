package Programming;

import java.util.HashMap;
import java.util.Map;

/*Given a list of tickets, find itinerary in order using the given list.

Input:
"Chennai" -> "Banglore"
"Bombay" -> "Delhi"
"Goa"    -> "Chennai"
"Delhi"  -> "Goa"

Output: 
Bombay->Delhi, Delhi->Goa, Goa->Chennai, Chennai->Banglore,

time complexity is O(n)*/

public class Find_Itinerary_From_Given_List_Of_Tickets {

	public static void main(String[] args) {
		Map<String, String> dataSet = new HashMap<String, String>();
		dataSet.put("Chennai", "Banglore");
		dataSet.put("Bombay", "Delhi");
		dataSet.put("Goa", "Chennai");
		dataSet.put("Delhi", "Goa");

		printResult(dataSet);

	}

	private static void printResult(Map<String, String> dataSet) {
		Map<String, String> reverseMap = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : dataSet.entrySet())
			reverseMap.put(entry.getValue(), entry.getKey());
		String start = null;
		for (Map.Entry<String, String> entry : dataSet.entrySet()) {
			if (!reverseMap.containsKey(entry.getKey())) {
				start = entry.getKey();
				break;
			}
		}
		if (start == null) {
			System.out.println("Invalid Input");
			return;
		}
		String to = dataSet.get(start);
		while (to != null) {
			System.out.print(start + "->" + to + ", ");
			start = to;
			to = dataSet.get(to);
		}
	}
}
