package lamda.Example7;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();

		SearchCriteria search = SearchCriteria.getInstance();

		System.out.println("\n=== Western Pilot Phone List ===");

		pl.stream().filter(search.getCriteria("allPilots")).forEach(p -> p.printName());

		System.out.println("\n=== Eastern Draftee Phone List ===");

		pl.stream().filter(search.getCriteria("allDraftees")).forEach(p -> p.printName());

	}

}
