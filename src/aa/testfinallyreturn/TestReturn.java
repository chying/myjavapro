package aa.testfinallyreturn;

public class TestReturn {
	public static void main(String[] args) {
		Thread a = new Thread();
		try {
			a.sleep(1000);
			System.out.println("return");
			return; 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
