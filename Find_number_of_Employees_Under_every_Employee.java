package Programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Given a dictionary that contains mapping of employee and his manager as a number of (employee, manager) pairs like below.

{ "A", "C" },
{ "B", "C" },
{ "C", "F" },
{ "D", "E" },
{ "E", "F" },
{ "F", "F" } 

In this example C is manager of A, 
C is also manager of B, F is manager 
of C and so on.
*/
public class Find_number_of_Employees_Under_every_Employee {

	static Map<String, Integer> result = new HashMap<String, Integer>();

	public static void main(String[] args) {
		Map<String, String> dataSet = new HashMap<String, String>();
		dataSet.put("A", "C");
		dataSet.put("B", "C");
		dataSet.put("C", "F");
		dataSet.put("D", "E");
		dataSet.put("E", "F");
		dataSet.put("F", "F");

		populateResult(dataSet);
		System.out.println("result = " + result);

	}

	private static void populateResult(Map<String, String> dataSet) {
		Map<String, List<String>> mngrEmpMap = new HashMap<String, List<String>>();
		for (Map.Entry<String, String> entry : dataSet.entrySet()) {
			String emp = entry.getKey();
			String mngr = entry.getValue();
			if (!emp.equals(mngr))	{
					List<String> directReportList = mngrEmpMap.get(mngr);
				if (directReportList == null)
					directReportList = new ArrayList<String>();
				directReportList.add(emp);
				mngrEmpMap.put(mngr, directReportList);
			}
		}
		for (String mngr : dataSet.keySet())
			populateResultUtil(mngr, mngrEmpMap);
	}

	private static int populateResultUtil(String mngr, Map<String, List<String>> mngrEmpMap) {
		int count = 0;
		if (!mngrEmpMap.containsKey(mngr)) {
			result.put(mngr, 0);
			return 0;
		}
		else if (result.containsKey(mngr))
			count = result.get(mngr);
		else {
			List<String> directReportEmpList = mngrEmpMap.get(mngr);
			count = directReportEmpList.size();
			for (String directReportEmp : directReportEmpList)
				count += populateResultUtil(directReportEmp, mngrEmpMap);

			result.put(mngr, count);
		}
		return count;
	}
}
