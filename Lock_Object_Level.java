package Programming;

/*Synchronization : Synchronization is a modifier which is used for method and block only. With the help of synchronized 
modifier we can restrict a shared resource to be accessed only by one thread. When two or more threads need access to 
shared resources, there is some loss of data i.e. data inconsistency. The process by which we can achieve data consistency 
between multiple threads it is called Synchronization.

Why do you need Synchronization?
Let us assume if you have two threads that are reading and writing to the same ‘resource’. Suppose there is a variable 
named as geek, and you want that at one time only one thread should access the variable(atomic way). But Without the 
synchronized keyword, your thread 1 may not see the changes thread 2 made to geek, or worse, it may only be half changed 
that cause the data inconsistency problem. This would not be what you logically expect. The tool needed to prevent these 
errors is synchronization.*/

/*In synchronization, there are two types of locks on threads:
	
1. Object level lock :-
Every object in java has a unique lock. Whenever we are using synchronized keyword, then only lock concept will come in 
the picture. If a thread wants to execute synchronized method on the given object. First, it has to get lock of that object. 
Once thread got the lock then it is allowed to execute any synchronized method on that object. Once method execution 
completes automatically thread releases the lock. Acquiring and release lock internally is taken care by JVM and programmer 
is not responsible for these activities.*/

public class Lock_Object_Level implements Runnable {

	public static void main(String[] args) {
		Lock_Object_Level g = new Lock_Object_Level();
		Thread t1 = new Thread(g);
		Thread t2 = new Thread(g);
		Lock_Object_Level g1 = new Lock_Object_Level();
		Thread t3 = new Thread(g1);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();

	}

	public void run() {
		Lock();
	}

	public void Lock() {
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			System.out.println("in block " + Thread.currentThread().getName());
			System.out.println("in block " + Thread.currentThread().getName() + " end");
		}
	}

}
