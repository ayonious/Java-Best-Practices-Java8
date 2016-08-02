#Best Practices of Functional Programming in Java 8

##Lamda Expression Examples

Lambda Runnable
```
Runnable r = () -> System.out.println("Hello world two!");
r.run();
```

Lamda Comparator Functions
```
List<Person> personList;
Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));
```

Function:
```
public String printCustom(Function<Person, String> f) {
	return f.apply(this);
}
	
Function<Person, String> westernStyle = p -> "\nName1: " + " " + p.getSurName();
Function<Person, String> easternStyle = p -> "\nName2: " + " " + p.getSurName();

for (Person person : list1) {
	System.out.println(person.printCustom(westernStyle));
	System.out.println(person.printCustom(easternStyle));
}
```


Predicate:
```
Predicate<Person> westernStyle = p -> (p.getAge() > 16);
Predicate<Person> easternStyle = p -> (p.getAge() > 17);

for (Person person : list1) {
	if (westernStyle.test(person)) System.out.println("west "+ person.getSurName());
	if (easternStyle.test(person)) System.out.println("east "+person.getSurName());
}
```

forEach:
```
List<Person> list;
list2.forEach(p -> {
	System.out.println(p.getSurName());
});
```

