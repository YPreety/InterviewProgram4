/*//Hello.java
package a;
public class Hello {
 public void printMessage()
 {
     System.out.println("Hello");
 }
}

//World.java
package b;
import a.Hello;
public class World extends Hello {
 public void printMessage()
 {
     System.out.println("World");
 }

 public static void main(String[] args)
 {
     Hello gfg = new World();
     gfg.printMessage();
 }
}

//Output: World*/