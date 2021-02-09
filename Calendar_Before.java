package Programming;

import java.util.Calendar;

/*java.util.Calendar.before() is a method in Calendar class of java.util package. The method returns true if the time
represented by this Calendar is before the time represented by when Object. If it is not the case, false is returned.*/

public class Calendar_Before {

	public static void main(String[] args) throws InterruptedException {
		Calendar cal_obj1 = Calendar.getInstance();

		// printing current date
		System.out.println("Time 1 : " + cal_obj1.getTime());

		// sleep for 3 seconds
		Thread.sleep(3000);

		// creating Calendar object
		Calendar cal_obj2 = Calendar.getInstance();

		// printing current date
		System.out.println("Time 2 : " + cal_obj2.getTime());

		// checking if 1st date is before 2nd date
		// and printing the result
		System.out.println(cal_obj1.before(cal_obj2));

		// changing year in cal_obj2 calendar
		cal_obj2.set(Calendar.YEAR, 2010);

		// displaying the year
		System.out.println("Year is " + cal_obj2.get(Calendar.YEAR));

		// check if calendar date is before current date
		System.out.println("Result : " + cal_obj1.before(cal_obj2));

		// changing year in cal_obj2 calendar
		cal_obj2.set(Calendar.YEAR, 2025);

		// displaying the year
		System.out.println("Year is " + cal_obj2.get(Calendar.YEAR));

		// check if calendar date is before current date
		System.out.println("Result : " + cal_obj1.before(cal_obj2));
	}

}
