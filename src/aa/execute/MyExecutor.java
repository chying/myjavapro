package aa.execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {
	public static void main(String[] args) {
		MyRunner runner = new MyRunner();

		ExecutorService a = Executors.newFixedThreadPool(1);
		for (;;) {
			a.execute(runner);
		}
	}
}
