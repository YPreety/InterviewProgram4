package Programming;

public class Overloading_Of_Thread_Class_Start_Method {

	public static void main(String[] args) {
		Bishal thread = new Bishal();
		thread.start();
		System.out.println("Main Method");

	}

}

class Bishal extends Thread {
	public void start() {
		System.out.println("Start Method");
	}

	public void run() {
		System.out.println("Run Method");
	}
}