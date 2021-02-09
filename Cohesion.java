package Programming;

/*cohesion refers all about how a single class is designed. Cohesion is the Object Oriented principle most closely 
associated with making sure that a class is designed with a single, well-focused purpose.
The more focused a class is, the cohesiveness of that class is more. The advantages of high cohesion is that such 
classes are much easier to maintain (and less frequently changed) than classes with low cohesion. Another benefit of 
high cohesion is that classes with a well-focused purpose tend to be more reusable than other classes.

Example : Suppose we have a class that multiply two numbers, but the same class creates a pop up window displaying the 
result. This is the example of low cohesive class because the window and the multiplication operation don’t have much in
common.To make it high cohesive, we would have to create a class Display and a class Multiply. The Display will call Multiply’s 
method to get the result and display it. This way to develop a high cohesive solution.*/

/*Difference between high cohesion and low cohesion:

1.High cohesion is when you have a class that does a well defined job. Low cohesion is when a class does a lot of jobs 
that don’t have much in common.
2.High cohesion gives us better maintaining facility and Low cohesion results in monolithic classes that are difficult 
to maintain, understand and reduces re-usability
*/

public class Cohesion {

	public static void main(String[] args) {
		Multiply m = new Multiply();
		System.out.println(m.mul(5, 5));
	}
}

class Multiply {
	int a = 5;
	int b = 5;
	public int mul(int a, int b) {
		this.a = a;
		this.b = b;
		return a * b;
	}
}