package Programming;

import java.util.Optional;

/*Optional Class | isPresent() function :- The isPresent() function in Optional Class is used to evaluate whether the value 
if assigned to variable is present or not.

Input : Optional value1 = Optional.ofNullable(10);
value1.isPresent()
Output : True

Input : Optional value2 = Optional.ofNullable(null);
value2.isPresent()
Output : False*/

public class OptionalClass {

	public static void main(String[] args) {
		Optional<Integer> value1 = Optional.ofNullable(10);
		Optional<Integer> value2 = Optional.ofNullable(null);
		System.out.println("First parameter is present:" + value1.isPresent());
		System.out.println("Second parameter is present:" + value2.isPresent());
	}
}
