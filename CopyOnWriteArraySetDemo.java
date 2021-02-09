package Programming;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo extends Thread {

	static CopyOnWriteArraySet l = new CopyOnWriteArraySet();

	public void run() {
		l.add("D");
	}

	public static void main(String[] args) {
		l.add("A");
		l.add("B");
		l.add("C");
		CopyOnWriteArraySetDemo t = new CopyOnWriteArraySetDemo();
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("child going to add element");
		}
		System.out.println(l);
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
			if (s.equals("C")) {
				itr.remove();
			}
		}
	}
}
