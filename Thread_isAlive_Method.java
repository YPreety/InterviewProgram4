package Programming;

/*How can one thread know when another thread has ended?
Java multi-threading provides two ways to find that :-  isAlive() and join() methods

isAlive() : It tests if this thread is alive. A thread is alive if it has been started and has not yet died. 
There is a transitional period from when a thread is running to when a thread is not running. After the run() method 
returns, there is a short period of time before the thread stops. If we want to know if the start method of the thread 
has been called or if thread has been terminated, we must use isAlive() method. This method is used to find out if a thread
has actually been started and has yet not terminated.

Syntax :- final boolean isAlive( )
Return Value:  returns true if the thread upon which it is called is still running. It returns false otherwise.*/

public class Thread_isAlive_Method  extends Thread{

	public static void main(String[] args) {
		Thread_isAlive_Method c1 = new Thread_isAlive_Method();
		Thread_isAlive_Method c2 = new Thread_isAlive_Method();
		c1.start();
		c2.start();
		System.out.println(c1.isAlive());
		System.out.println(c2.isAlive());

	}

	public void run() {
		System.out.println("geeks ");
		try {
			Thread.sleep(300);
		} catch (InterruptedException ie) {
		}
		System.out.println("forgeeks ");
	}

}
