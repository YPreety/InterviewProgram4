package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*sort Employee list on basis of name and id in ascending order by implementing Comparator interface 
in inner and static nested class and overriding its compare method in java*/

public class ComparatorUsageExample3 {

	public static void main(String[] args) {
		Employee3 emp1 = new Employee3("sam", "4");
		Employee3 emp2 = new Employee3("amy", "2");
		Employee3 emp3 = new Employee3("brad", "1");

		ArrayList<Employee3> list = new ArrayList<Employee3>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		System.out.println("list Before sorting : \n" + list);

		Collections.sort(list, new Employee3().new ComparatorName());
		System.out
				.println("\nlist after sorting on basis of name(ascending order), " + "using inner class : \n" + list);

		Collections.sort(list, new Employee3.ComparatorId());
		System.out.println(
				"\nlist after sorting on basis of id(ascending order), " + "using static nested class : \n" + list);

	}

}

class Employee3 {
	String name;
	String id;

	public Employee3() {
	}

	public Employee3(String name, String id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee3{" + "name=" + name + ", id=" + id + '}';
	}

	// Inner class
	class ComparatorName implements Comparator<Employee3> {
		@Override
		public int compare(Employee3 obj1, Employee3 obj2) {
			// sort Employee3 on basis of name(ascending order)
			return obj1.name.compareTo(obj2.name);
		}
	}

	// static nested class
	static class ComparatorId implements Comparator<Employee3> {
		@Override
		public int compare(Employee3 obj1, Employee3 obj2) {
			// sort Employee3 on basis of id(ascending order)
			return obj1.id.compareTo(obj2.id);
		}
	}

}