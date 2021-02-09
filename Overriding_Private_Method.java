/*package Programming;

How JVM find which method to call?
When we run a java program,

1.JVM checks the runtime class of the object.
2.JVM checks whether the object’s runtime class has overridden the method of the declared class.
3.If so, that’s the method called. Otherwise, declared class’s method is called.

//Filename: Hello.java
package a;
public class Hello {
 private void printMessage()
 {
     System.out.println("Hello");
 }
 public void fun()
 {
     printMessage();
 }
}

//Filename: World.java
package b;
import a.Hello;
public class World extends Hello {
 private void printMessage()
 {
     System.out.println("World");
 }

 public static void main(String[] args)
 {
     Hello gfg = new World();
     gfg.fun();
 }
}

//Output: Hello*/