package Programming;

/*Loose coupling : In simple words, loose coupling means they are mostly independent. 
If the only knowledge that class A has about class B, is what class B has exposed through its interface, 
then class A and class B are said to be loosely coupled. 
In order to over come from the problems of tight coupling between objects, spring framework uses dependency injection 
mechanism with the help of POJO/POJI model and through dependency injection its possible to achieve loose coupling.

Example : If you change your shirt, then you are not forced to change your body – when you can do that, 
then you have loose coupling. When you can’t do that, then you have tight coupling. 

The examples of Loose coupling are Interface, JMS.*/

/*Which is better tight coupling or loose coupling?

In general, Tight Coupling is bad in but most of the time, because it reduces flexibility and re-usability of code, 
it makes changes much more difficult, it impedes test ability etc. loose coupling is a better choice because 
A loosely coupled will help you when your application need to change or grow. If you design with loosely coupled 
architecture, only a few parts of the application should be affected when requirements change.*/

/*Difference between tight coupling and loose coupling

1. Tight coupling is not good at the test-ability. But loose coupling improves the test ability.
2. Tight coupling does not provide the concept of interface. But loose coupling helps us follow the GOF principle of 
program to interfaces, not implementations.
3. In Tight coupling, it is not easy to swap the codes between two classes. But it’s much easier to swap other pieces 
of code/modules/objects/components in loose coupling.
4. Tight coupling does not have the changing capability. But loose coupling is highly changeable.*/

public class Coupling_Loose {

	public static void main(String[] args) {
		Box1 b = new Box1(5, 5, 5);
		System.out.println(b.getVolume());

	}

}

final class Box1 {
	private int volume;

	Box1(int length, int width, int height) {
		this.volume = length * width * height;
	}

	public int getVolume() {
		return volume;

	}
}
