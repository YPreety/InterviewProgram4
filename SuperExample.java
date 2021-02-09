package Programming;

//super() is use to call Base class’s(Parent class’s) constructor.
/*super() should be first statement inside any constructor. It can be used only inside constructor and nowhere else. 
super() is used to refer only parent class’s(super class’s) constructor.*/

public class SuperExample extends Parent {
	SuperExample() {
		super();
		System.out.println("Flow comes back from " + "Parent class no arg const");
	}

	public static void main(String[] args) {
		new SuperExample();
		System.out.println("Inside Main");
	}
}

class Parent {
	Parent() {
		System.out.println("Parent class's No " + " arg constructor");
	}
}