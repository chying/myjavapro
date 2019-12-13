package aa.thread;

public class TestThread extends Thread {

	public TestThread(String string) {
		super();
	}

	@Override
	public void start() {
		System.out.println(currentThread().getName());
		System.out.println("aaaaaaaa");
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName());
		System.out.println("runnn");
	}

	public static void main(String[] args) {

		TestThread a = new TestThread("eew");
		a.start();

//		TestRunnable a = new TestRunnable();
//
//		new Thread(a, "run").start();
	}
}
