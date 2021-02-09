package Programming;

import java.util.ArrayList;
import java.util.Iterator;

public class CopyDemo_Using_ArrayList {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("B")) {
				itr.remove();
			}
		}
		System.out.println(l);
	}
}
