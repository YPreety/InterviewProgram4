package Programming;

public class Overloading_Of_Thread_Class_Run_Method {

	public static void main(String[] args) {
		G t = new G();
		t.start();

	}

}

class G extends Thread {
	public void run() {
		System.out.println("GeeksforGeeks"); // GeeksforGeeks
	}

	public void run(int i) {
		System.out.println("Bishal");
	}
}
