package stream.Example3StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//consecutive operation on arrays

public class Ex5reduce {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("ab", "b", "c", "d", "e");

		Stream<String> st = list.stream();

		// reduce(initval,function to merge)
		String ret = st.reduce("", (p1, p2) -> p1 + p2);
		System.out.println(ret);
		// output: abbcde

		st = list.stream();
		ret = st.reduce("", (p1, p2) -> p2 + p1);
		System.out.println(ret);
		// output: edcbab

		// sum
		List<Integer> ls = Arrays.asList(3, 4, 5, 1, 0, -1);
		System.out.println(ls.stream().reduce(0, (p1, p2) -> p1 + p2));
		// output:12

		// finding max
		System.out.println(ls.stream().reduce(0, (p1, p2) -> Math.max(p1, p2)));
		// output: 5

	}

}
