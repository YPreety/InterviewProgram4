package Programming;

/*join() : When the join() method is called, the current thread will simply wait until the thread it is joining with is 
no longer alive.Or we can say the method that you will more commonly use to wait for a thread to finish is called join( ).
This method waits until the thread on which it is called terminates. Its name comes from the concept of the calling thread 
waiting until the specified thread joins it. Additional forms of join( ) allow you to specify a maximum amount of time that
you want to wait for the specified thread to terminate.

Syntax : final void join( ) throws InterruptedException*/

public class Thread_Join_Method extends Thread {

	public static void main(String[] args) {
		Thread_Join_Method c1 = new Thread_Join_Method();
		Thread_Join_Method c2 = new Thread_Join_Method();
		c1.start();

		try {
			c1.join(); // Waiting for c1 to finish
		} catch (InterruptedException ie) {
		}

		c2.start();

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
