package Programming;

import java.util.Calendar;

/*java.util.Calendar.after() is a method in Calendar class of java.util package. The method returns true if the time 
represented by this Calendar is after the time represented by when Object. If it is not the case, false is returned.*/

public class Calendar_After {

	public static void main(String[] args) {
		Calendar cal_obj1 = Calendar.getInstance();

		// printing current date
		System.out.println("Time 1 : " + cal_obj1.getTime());

		// creating Calendar object
		Calendar cal_obj2 = Calendar.getInstance();

		// printing current date
		System.out.println("Time 2 : " + cal_obj2.getTime());

		// checking if 1st date is after 2nd date
		// and printing the result
		System.out.println(cal_obj1.after(cal_obj2));

		// changing year in cal_obj2 calendar
		cal_obj2.set(Calendar.YEAR, 2010);

		// check if calendar date is after current date
		System.out.println("Result : " + cal_obj1.after(cal_obj2));
	}

}
