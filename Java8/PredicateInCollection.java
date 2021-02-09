package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInCollection {

	String name, role;

	PredicateInCollection(String a, String b) {
		name = a;
		role = b;
	}

	String getRole() {
		return role;
	}

	String getName() {
		return name;
	}

	public String toString() {
		return "User Name : " + name + ", Role :" + role;
	}

	public static void main(String[] args) {
		List<PredicateInCollection> users = new ArrayList<PredicateInCollection>();
		users.add(new PredicateInCollection("Preety", "admin"));
		users.add(new PredicateInCollection("Veer", "member"));
		List admins = process(users, (PredicateInCollection u) -> u.getRole().equals("admin"));
		System.out.println(admins);

	}

	public static List<PredicateInCollection> process(List<PredicateInCollection> users, Predicate<PredicateInCollection> predicat) {
		List<PredicateInCollection> result = new ArrayList<PredicateInCollection>();
		for (PredicateInCollection user : users)
			if (predicat.test(user))
				result.add(user);
		return result;
	}

}
