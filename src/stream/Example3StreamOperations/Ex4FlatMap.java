package stream.Example3StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex4FlatMap {
	public static void main(String[] args) {
		// maring all the streams into one stream
		Stream<List<String>> namesOriginalList = Stream.of(Arrays.asList("Pankaj"), Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));

		// flat the stream from List<String> to String stream
		Stream<String> flatStream = namesOriginalList.flatMap(p -> p.stream());

		flatStream.forEach(p -> System.out.println(p));

	}

}
