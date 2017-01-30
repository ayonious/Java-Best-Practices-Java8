package Future.Example1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
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
}
