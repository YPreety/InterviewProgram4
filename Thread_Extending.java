package Programming;

/*differences between extending Thread class and implementing Runnable interface:

1.When we extend Thread class, we can’t extend any other class even we require and When we implement Runnable, 
we can save a space for our class to extend any other class in future or now.

2.When we extend Thread class, each of our thread creates unique object and associate with it. 
When we implements Runnable, it shares the same object to multiple threads.*/

public class Thread_Extending extends Thread {

	public static void main(String[] args) {
		Thread_Extending t = new Thread_Extending();
		t.start();
		System.out.println("Main method executed by main thread");

	}

	public void run() {
		System.out.println("Run method executed by child Thread");
	}
}


/*output
Main method executed by main thread
Run method executed by child Thread*/