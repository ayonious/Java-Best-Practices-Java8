package lamda.Example5.Predicate;

import java.util.List;
import java.util.function.Predicate;

/*
 Predicate is a builltin interface 
 
 
 public interface Predicate <T>
 {
 	public boolean test(T);
 }
 
*/

public class Main {

	public static void main(String[] args) {

		System.out.println("\n==== NameTestNew02 ===");

		List<Person> list1 = Person.createShortList();

		// Define Western and Eastern Lambdas

		Predicate<Person> westernStyle = p -> (p.getAge() > 16);

		Predicate<Person> easternStyle = p -> p.getAge() > 17;

		// Print Western List
		System.out.println("\n===Western List===");
		for (Person person : list1) {
			if (westernStyle.test(person))
				System.out.println(person.getSurName());
		}

		// Print Eastern List
		System.out.println("\n===Eastern List===");
		for (Person person : list1) {
			if (easternStyle.test(person))
				System.out.println(person.getSurName());
		}

	}

}
