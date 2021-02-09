package Programming;

/*Instance Initialization Blocks : IIB are used to initialize instance variables. IIBs are executed before constructors. 
They run each time when object of the class is created.

Initializer block : contains the code that is always executed whenever an instance is created. It is used to 
declare/initialize the common part of various constructors of a class.

Constructors : are used to initialize the object’s state. Like methods, a constructor also contains collection of 
statements(i.e. instructions) that are executed at time of Object creation.

Order of execution of Initialization blocks and constructor in Java

1.Static initialization blocks will run whenever the class is loaded first time in JVM
2.Initialization blocks run in the same order in which they appear in the program.
3.Instance Initialization blocks are executed whenever the class is initialized and before constructors are invoked. 
They are typically placed above the constructors within braces.*/

public class Initialization_blocks_and_Constructors {

	public static void main(String[] args) {
		new GFG();
		new GFG(8);
	}
}

class GFG {

	GFG(int x) {
		System.out.println("ONE argument constructor");
	}

	GFG() {
		System.out.println("No  argument constructor");
	}

	static {
		System.out.println("1st static init");
	}

	{
		System.out.println("1st instance init");
	}

	{
		System.out.println("2nd instance init");
	}

	static {
		System.out.println("2nd static init");
	}
}
