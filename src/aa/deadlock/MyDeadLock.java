package aa.deadlock;

public class MyDeadLock extends Thread {
	private String first;
	private String second;

	public MyDeadLock(String name, String first, String second) {
		super(name);
		this.first = first;
		this.second = second;
	}

	public void run() {
		synchronized (first) {
			System.out.println(this.getName() + "obtained" + first);
			try {
				Thread.sleep(1000L);
				synchronized (second) {
					System.out.println(this.getName() + "obtained" + first);
				}
			} catch (InterruptedException e) {

			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		String lockA = "lockA";
		String lockB = "lockB";
		MyDeadLock t1 = new MyDeadLock("Thread1", lockA, lockB);
		MyDeadLock t2 = new MyDeadLock("Thread2", lockB, lockA);
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}
}
