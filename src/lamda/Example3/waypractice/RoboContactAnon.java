package lamda.Example3.waypractice;

import java.util.List;

public class RoboContactAnon {

	public void phoneContacts(List<Person> pl, MyTest<Person, Person> aTest) {
		for (Person p : pl) {
			if (aTest.test(p, p)) {
				roboCall(p);
			}
		}
	}

	public void roboCall(Person p) {
		System.out.println("Calling " + p.getSurName() + " " + p.getSurName() + " age ");
	}

}
