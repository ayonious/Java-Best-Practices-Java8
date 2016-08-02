package lamda.Example2;

import java.util.*;

public class Person {
	private String givenName;
	private String surName;
	private int age;
	private String eMail;
	private String phone;
	private String address;
	private String gender;

	public Person(String sur) {
		surName = sur;
	}

	public void printName() {
		System.out.println(surName);
	}

	public static List<Person> createShortList() {
		List<Person> people = new ArrayList<>();

		people.add(new Person("z"));
		people.add(new Person("x"));
		people.add(new Person("c"));

		return people;
	}

	String getSurName() {
		return surName;
	}

}
