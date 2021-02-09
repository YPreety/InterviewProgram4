package Programming;

/*Delegation is simply passing a duty off to someone/something else.

1.Delegation can be an alternative to inheritance.

2.Delegation means that you use an object of another class as an instance variable, and forward messages to the instance.

3.It is better than inheritance for many cases because it makes you to think about each message you forward, because the instance 
is of a known class, rather than a new class, and because it doesn’t force you to accept all the methods of the super class: 
     you can provide only the methods that really make sense.
	
4.Delegation can be viewed as a relationship between objects where one object forwards certain method calls to another object, 
called its delegate.

5.The primary advantage of delegation is run-time flexibility – the delegate can easily be changed at run-time. But unlike 
inheritance, delegation is not directly supported by most popular object-oriented languages, and it doesn’t facilitate dynamic 
polymorphism.*/

public class Delegation {

	public static void main(String[] args) {
		 Printer printer = new Printer();
	        printer.print();

	}

}
class RealPrinter {
    // the "delegate"
    void print()
    {
        System.out.println("The Delegate");
    }
}
 
class Printer {
    // the "delegator"
    RealPrinter p = new RealPrinter();
 
    // create the delegate
    void print()
    {
        p.print(); // delegation
    }
}