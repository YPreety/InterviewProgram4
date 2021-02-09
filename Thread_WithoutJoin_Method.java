package Programming;

public class Thread_WithoutJoin_Method extends Thread {

	public static void main(String[] args) {
		Thread_WithoutJoin_Method c1 = new Thread_WithoutJoin_Method();
		Thread_WithoutJoin_Method c2 = new Thread_WithoutJoin_Method();
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
