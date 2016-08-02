package stream.Example6.UnboundedOntheFlyStream2Generate;

import java.util.function.Supplier;

public class FibMaker implements Supplier<Long> {

	private Long p1, p2;

	public FibMaker(Long i, Long j) {
		p1 = i;
		p2 = j;
	}

	public Long get() {
		Long ret = p1 + p2;
		p1 = p2;
		p2 = ret;
		return ret;
	}
}
