package stream.Example6.UnboundedOntheFlyStream2Generate;

import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		// this can handle multiple previous variables
		FibMaker f_gen = new FibMaker(Long.valueOf(-1), Long.valueOf(1));
		Stream.generate(f_gen).limit(10).forEach(System.out::println);
	}
}
