package Programming;

/*Coupling refers to the degree of direct knowledge that one element has of another. 
In other words, how often do changes in class A force related changes in class B.

Tight coupling : In general, Tight coupling means the two classes often change together. 
In other words, if A knows more than it should about the way in which B was implemented, then A and B are tightly coupled.

Example : If you want to change the skin, you would also have to change the design of your body as well because 
the two are joined together – they are tightly coupled. The best example of tight coupling is RMI(Remote Method Invocation).*/

public class Coupling_Tight {

	public static void main(String[] args) {
		Box b = new Box(5, 5, 5);
		System.out.println(b.volume);

	}

}

class Box {
	public int volume;

	Box(int length, int width, int height) {
		this.volume = length * width * height;
	}
}