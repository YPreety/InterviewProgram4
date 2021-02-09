package Comparable_Comparator;

/*sort Employee list on basis of name in ascending order by implementing Comparable interface 
and overriding its compareTo method in java*/

/*sort Employee list on basis of name in descending order by implementing Comparable interface 
and overriding its compareTo method in java*/

import java.util.ArrayList;
import java.util.Collections;

public class ComparableUsageExample {

	public static void main(String[] args) {
		Employee emp1 = new Employee("sam", "4");
		Employee emp2 = new Employee("amy", "2");
		Employee emp3 = new Employee("brad", "1");
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println("list Before sorting : \n" + list);
		Collections.sort(list);
		System.out.println("\nlist after sorting on basis of name(ascending order) : \n" + list);
	}
}

class Employee implements Comparable<Employee> {
	String name;
	String id;
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public int compareTo(Employee otherEmployee) {
		// sort Employee on basis of name(ascending order)
		return this.name.compareTo(otherEmployee.name);
	}
	@Override
	public String toString() {
		return "Employee{" + "name=" + name + ", id=" + id + '}';
	}
}
