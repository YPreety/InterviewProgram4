package Programming;

public class Thread_Runnable extends T implements Runnable {

	public static void main(String[] args) {
		Thread_Runnable t = new Thread_Runnable();
		t.m1();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("Main method executed by main thread");

	}

	public void run() {
		System.out.println("Run method executed by child Thread");
	}
}

class T {
	public static void m1() {
		System.out.println("Hello Visitors");
	}
}


/*output
Hello Visitors
Main method executed by main thread
Run method executed by child Thread*/