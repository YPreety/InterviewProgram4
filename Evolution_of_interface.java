/*package Programming;

In Java SE 7 or earlier versions, an interface can have only:
Constant variables
Abstract methods
We can’t provide implementations of methods in interfaces.

public interface GFG{
      String a = "Geeksforgeeks is the best.";
     
      void hello(String a);
      void world(int x);
}

Java SE 8:
We can write method implementations in Interface from Java SE 8 and on-wards. We need to use “default” keyword to define 
them as shown below.interface can have only four kinds of things:

Constant variables
Abstract methods
Default methods
Static methods
public interface GFG{
      String b = "Shubham is a brilliant coder.";
   
      default void hello(String a){
         System.out.println("Hello");
      }
      static void world(int x){
         System.out.println("World");
      }
      void bye();
   }

Java SE 9:
we can write private methods in Interfaces using ‘private’ access modifier as shown below (like other private methods).
In Java SE 9 and later versions, an interface can have:

Constant variables
Abstract methods
Default methods
Static methods
Private methods
Private Static methods

public interface GFG{
    String b = "Shubham is a brilliant coder.";
 
    default void hello(String a){
       System.out.println("Hello");
    }
    static void world(int x){
       System.out.println("World");
    }
    void bye();

    private void great(long v){
        
    }
 }*/