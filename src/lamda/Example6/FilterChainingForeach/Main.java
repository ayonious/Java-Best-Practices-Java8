package lamda.Example6.FilterChainingForeach;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
collect used to put stream back to list/set

*/

public class Main {

	public static void main(String[] args) {

		System.out.println("\n==== NameTestNew02 ===");

		List<Person> list1 = Person.createShortList();
		List<Person> list2;
		Set<Person> list3;

		// Define Western and Eastern Lambdas

		Predicate<Person> westernStyle = p -> (p.getAge() > 16);

		// Print Western List
		System.out.println("\n===Western List===");

		// stream, predicate inside filters
		list2 = list1.stream().filter(westernStyle).collect(Collectors.toList());

		// block in foreach
		list2.forEach(p -> {
			System.out.println(p.getSurName());
		});

		// Print Eastern List
		System.out.println("\n===Eastern List===");

		// make a set
		list3 = list1.stream().filter(p -> p.getAge() > 10).collect(Collectors.toSet());

		// expression in foreach
		list3.forEach(p -> p.printName());

		// make a map
		Map<String, Integer> intMap = list1.stream().collect(Collectors.toMap(p -> p.getSurName(), p -> p.getAge()));
		System.out.println(intMap);

	}

}
