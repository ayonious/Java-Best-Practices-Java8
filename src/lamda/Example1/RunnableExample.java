package lamda.Example1;

public class RunnableExample {
	public static void main(String[] args) {
		System.out.println("=== RunnableTest ===");

		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world one!");
			}
		};

		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Hello world two!");

		// Lambda Runnable with block
		Runnable r3 = () -> {
			int i;
			for (i = 0; i < 3; i++)
				System.out.println("Hello world three!");

		};

		// Run em!
		r1.run();
		r2.run();
		r3.run();

	}
}
