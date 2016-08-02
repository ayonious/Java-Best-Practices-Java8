package lamda.Example4.Function;

import java.util.List;
import java.util.function.Function;

/*
 Function is a builltin interface 
 
 public interface Predicate <T>
 {
 	public boolean apply(T1);
 }
 
*/

public class Main {

	public static void main(String[] args) {

		System.out.println("\n==== NameTestNew02 ===");

		List<Person> list1 = Person.createShortList();

		// Define Western and Eastern Lambdas

		Function<Person, String> westernStyle = p -> "\nName1: " + " " + p.getSurName() + "\n";

		Function<Person, String> easternStyle = p -> "\nName2: " + " " + p.getSurName() + "\n";

		// Print Western List
		System.out.println("\n===Western List===");
		for (Person person : list1) {
			System.out.println(person.printCustom(westernStyle));
		}

		// Print Eastern List
		System.out.println("\n===Eastern List===");
		for (Person person : list1) {
			System.out.println(person.printCustom(easternStyle));
		}

	}

}
