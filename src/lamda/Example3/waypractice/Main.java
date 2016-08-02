package lamda.Example3.waypractice;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();
		RoboContactAnon robo = new RoboContactAnon();

		System.out.println("\n=== Calling===");
		robo.phoneContacts(pl, (p1, p2) -> (p1.getAge() + p2.getAge()) >= 16);

	}

}
