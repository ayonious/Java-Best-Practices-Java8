#Best Practices of Functional Programming in Java 8

##Lamda Expression Synopsis

Runnable:
```
Runnable r = () -> System.out.println("Hello world two!");
r.run();
```

Comparator Functions:
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
##Stream Synopsis

Cretion:
```
// We can use Stream.of() to create a stream from similar type of data.
// For example, we can create Stream of integers from a group of int or
// Integer objects.
Stream<Integer> stream = Stream.of(1, 2, 3, 4);

// works fine
stream = Stream.of(new Integer[] { 1, 2, 3, 4 });

// Compile time error, Type mismatch: cannot convert from Stream<int[]>
// to Stream<Integer>
// stream1 = Stream.of(new int[]{1,2,3,4});
```

Future:
```
private static ExecutorService pool = Executors.newFixedThreadPool(3);

public static void main(String[] args) throws InterruptedException, ExecutionException {
    System.out.println("=== Future Test ===");

    Future<String> futureTask = getValue("1", "2");

    System.out.println("future done? " + futureTask.isDone()); //task may not be done at this stage

    String result2 = futureTask.get(); //wait till the task is done

    System.out.println("future done? " + futureTask.isDone());
    System.out.print("result: " + result2);
}

public static Future<String> getValue(String value1, String value2) {
    return pool.submit(new Callable<String>() {
        @Override
        public String call() throws Exception {
            Thread.sleep(3000);
            return value1+value2;
        }
    });
}
```
