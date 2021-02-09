/*// Hello.java
package a;
public class Hello {
    void printMessage()
    {
        System.out.println("Hello");
    }
}
 
// World.java
package b;
import a.Hello;
public class World extends Hello {
    void printMessage()
    {
        System.out.println("World");
    }
    public static void main(String[] args)
    {
        Hello gfg = new World();
        gfg.printMessage();
    }
}

//output :- error: printMessage() is not public in Hello; cannot be accessed from outside package*/