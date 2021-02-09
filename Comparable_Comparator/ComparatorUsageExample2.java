package Comparable_Comparator;

/*sort Employee list on basis of name and id in ascending order by implementing Comparator interface
 
and overriding its compare method in java*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorUsageExample2 {

	public static void main(String[] args) {
		Employee2 emp1 = new Employee2("sam", "4");
		Employee2 emp2 = new Employee2("amy", "2");
		Employee2 emp3 = new Employee2("brad", "1");

		ArrayList<Employee2> list = new ArrayList<Employee2>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		System.out.println("list Before sorting : \n" + list);

		Collections.sort(list, new ComparatorName());
		System.out.println("\nlist after sorting on basis of name(ascending order) : \n" + list);

		Collections.sort(list, new ComparatorId());
		System.out.println("\nlist after sorting on basis of id(ascending order) : \n" + list);

	}

}

class Employee2 {
	String name;
	String id;

	public Employee2() {
	}

	public Employee2(String name, String id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee2{" + "name=" + name + ", id=" + id + '}';
	}

}

class ComparatorName implements Comparator<Employee2> {
	@Override
	public int compare(Employee2 obj1, Employee2 obj2) {
		// sort Employee2 on basis of name(ascending order)
		return obj1.name.compareTo(obj2.name);
	}

}

class ComparatorId implements Comparator<Employee2> {
	@Override
	public int compare(Employee2 obj1, Employee2 obj2) {
		// sort Employee2 on basis of id(ascending order)
		return obj1.id.compareTo(obj2.id);
	}

}