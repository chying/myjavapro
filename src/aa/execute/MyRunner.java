package aa.execute;

public class MyRunner implements Runnable {
	static int i;

	@Override
	public void run() {
		if (i++ % 1000000 == 1) {
			System.out.println(i);
		}
	}

}
