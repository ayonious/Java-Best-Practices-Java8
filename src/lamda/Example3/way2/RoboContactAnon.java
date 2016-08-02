package lamda.Example3.way2;

import java.util.List;

public class RoboContactAnon {

	public void phoneContacts(List<Person> pl, MyTest<Person> aTest) {
		for (Person p : pl) {
			if (aTest.test(p)) {
				roboCall(p);
			}
		}
	}

	public void emailContacts(List<Person> pl, MyTest<Person> aTest) {
		for (Person p : pl) {
			if (aTest.test(p)) {
				roboEmail(p);
			}
		}
	}

	public void mailContacts(List<Person> pl, MyTest<Person> aTest) {
		for (Person p : pl) {
			if (aTest.test(p)) {
				roboMail(p);
			}
		}
	}

	public void roboCall(Person p) {
		System.out.println("Calling " + p.getSurName() + " " + p.getSurName() + " age ");
	}

	public void roboEmail(Person p) {
		System.out.println("EMailing " + p.getSurName() + " " + p.getSurName() + " age ");
	}

	public void roboMail(Person p) {
		System.out.println("Mailing " + p.getSurName() + " " + p.getSurName() + " age ");
	}

}
