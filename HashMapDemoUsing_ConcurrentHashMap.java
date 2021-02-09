package Programming;

import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemoUsing_ConcurrentHashMap extends Thread {

	static ConcurrentHashMap<Integer,String> l = new ConcurrentHashMap<Integer,String>();

	public void run() {
		// Child thread trying to add
		// new element in the object
		l.put(103, "D");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread going to add element");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		l.put(100, "A");
		l.put(101, "B");
		l.put(102, "C");
		HashMapDemoUsing_ConcurrentHashMap t = new HashMapDemoUsing_ConcurrentHashMap();
		t.start();

		for (Object o : l.entrySet()) {
			Object s = o;
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(l);
	}

}
