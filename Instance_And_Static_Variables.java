package Programming;

/*Instance variables : Instance variables are declared in a class, but outside a method, constructor or any block. 
When a space is allocated for an object in the heap, a slot for each instance variable value is created. 
Instance variables are created when an object is created with the use of the keyword ‘new’ and destroyed when the object
is destroyed. They are property of an object so they can be accessed using object only.

Static variables : Class variables also known as static variables are declared with the static keyword in a class, 
but outside a method, constructor or a block. There would only be one copy of each class variable per class, 
regardless of how many objects are created from it. They are property of a class not of an object so they can
be used directly using class name as well as using object.*/

public class Instance_And_Static_Variables {

	String name;
	int salary;
	static String company;

	public static void main(String[] args) {
		Instance_And_Static_Variables.company = "GeeksForGeeks";
		Instance_And_Static_Variables g = new Instance_And_Static_Variables();
		g.name = "Shubham";
		g.salary = 100000;

		Instance_And_Static_Variables sp = new Instance_And_Static_Variables();
		sp.name = "Chirag";
		sp.salary = 200000;

		g.printDetails();
		sp.printDetails();

		g.company = "Google";
		g.salary = 200000;
		System.out.println("\nAfter change\n");
		g.printDetails();
		sp.printDetails();

	}

	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Company: " + company);
		System.out.println("Salary: " + salary);
	}

}
