package Java8;

import java.util.function.Predicate;

public class PredicateSimple {

	public static void main(String[] args) {
		Predicate<Integer> lesserthan = i -> (i < 18); 
        System.out.println(lesserthan.test(20)); 

	}

}
