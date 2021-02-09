package Programming;

/*2. Class level lock : Every lock in java has a unique lock which is nothing but class level lock. If a thread wants 
to execute a static synchronized method, then thread requires class level lock. Once a thread got the class level lock, 
then it is allowed to execute any static synchronized method of that class. Once method execution completes automatically 
thread releases the lock.*/

public class Lock_Class_Level implements Runnable {

	public static void main(String[] args) {
		Lock_Class_Level g1 = new Lock_Class_Level();
		Thread t1 = new Thread(g1);
		Thread t2 = new Thread(g1);
		Lock_Class_Level g2 = new Lock_Class_Level();
		Thread t3 = new Thread(g2);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();

	}

	public void run() {
		Lock();
	}

	public void Lock() {
		System.out.println(Thread.currentThread().getName());
		synchronized (Lock_Class_Level.class) {
			System.out.println("in block " + Thread.currentThread().getName());
			System.out.println("in block " + Thread.currentThread().getName() + " end");
		}
	}

}
