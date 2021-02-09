package Programming;

/*3.Interrupting a thread that works normally : In the program, there is no exception occurred during the execution of thread.
Here, interrupt only sets the interrupted flag to true, which can be used by java programmer later.*/

public class Thread_interrupt_method3 {

	public static void main(String[] args) {
		Geeks1 t1 = new Geeks1();
		t1.start();
		t1.interrupt();
	}
}

class Geeks1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println(i); //0 1 2 3 4
	}
}