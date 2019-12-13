package aa;

import java.util.ArrayDeque;

public class MyQueue {
	public static void main(String[] args) {
		int[] array = new int[16];
		int head = 0;
		head = (head - 1) & (array.length - 1);

		ArrayDeque<String> a = new ArrayDeque<String>();
		a.addFirst("1");
		

		System.out.println(array.length);
	}
}
