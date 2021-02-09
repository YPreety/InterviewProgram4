package Programming;

/*interrupt() method : If any thread is in sleeping or waiting state then using interrupt() method, 
we can interrupt the execution of that thread by showing InterruptedException. A thread which is in the sleeping or 
waiting state can be interrupted with the help of interrupt() method of Thread class.

Example : Suppose there are two threads and If one of the threads is blocked in an invocation of the wait(), wait(long),
or wait(long, int) methods of the Object class, or of the join(), join(long), join(long, int), sleep(long), or 
sleep(long, int), methods of this class, then its interrupt status will be cleared and it will receive an 
InterruptedException, which gives the chance to another thread to execute the corresponding run() method of another 
thread which results into high performance and reduces the waiting time of the threads.

scenarios where we can interrupt a thread:-
1.Interrupting a thread that doesn’t stop working : In the program, we handle the InterruptedException using try and catch 
block, so whenever any thread interrupt currently executing thread it will comes out from the sleeping state but it will 
not stop working.*/

public class Thread_interrupt_method1 {

	public static void main(String[] args) throws InterruptedException {
		MyClass thread = new MyClass();
		thread.start();

		thread.interrupt();
		System.out.println("Main thread execution completes");
	}
}

class MyClass extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child Thread executing");

				// Here current threads goes to sleeping state Another thread gets the chance to execute
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("InterruptedException occur");
		}
	}
}

//output
//Main thread execution completes
//Child Thread executing
//InterruptedException occur