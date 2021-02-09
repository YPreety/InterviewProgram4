package Java8;

import java.util.function.Predicate;

public class PredicateInToFunction {

	public static void main(String[] args) {
		pred(10, (i) -> i > 7);

	}

	static void pred(int number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("Number " + number);
		}
	}

}
