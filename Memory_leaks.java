package Programming;

import java.util.Vector;

public class Memory_leaks {

	public static void main(String[] args) {
		Vector v = new Vector(214444);
        Vector v1 = new Vector(214744444);
        Vector v2 = new Vector(2144444449);
        System.out.println("Memory Leaks");

	}

}
