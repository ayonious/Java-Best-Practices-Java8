package stream.Example3StreamOperations;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2map {
	public static void main(String[] args) {

		// We can use map() to apply functions to an stream.
		// Let�s see how we can use it to apply upper case function to a list of
		// Strings.
		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println(names.map(s -> {
			return s.toUpperCase();
		}).collect(Collectors.toList()));
		// prints [ABC, D, EF]

	}

}
