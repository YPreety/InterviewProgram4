package Programming;

//this() is used to call current class’s constructor.
/*this() should be first statement inside any constructor. It can be used only inside constructor and nowhere else. 
this() is use to refer only current class’s constructor.*/

public class ThisExample {

	ThisExample() {
		this(10);
		System.out.println("Flow comes back from " + "RR class's 1 arg const");
	}

	ThisExample(int a) {
		System.out.println("RR class's 1 arg const");
	}

	public static void main(String[] args) {
		new ThisExample();
		System.out.println("Inside Main");

	}

}
