package Programming;

/*2.Interrupting a thread that stops working : In the program, after interrupting currently executing thread,
we are throwing a new exception in the catch block so it will stop working.*/

public class Thread_interrupt_method2 {

	public static void main(String[] args) {
		Geeks t1 = new Geeks();
		t1.start();
		try {
			t1.interrupt();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}
}

class Geeks extends Thread {
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Geeksforgeeks");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread " + "interrupted");
		}
	}
}

//output
//Exception in thread "Thread-0" java.lang.RuntimeException: Thread interrupted