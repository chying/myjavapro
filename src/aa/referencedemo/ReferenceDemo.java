package aa.referencedemo;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceDemo {
	public static void main(String[] args) {
		String str = new String("abc");
		SoftReference<String> softRef = new SoftReference<>(str);
		str = null;
		System.gc();
		// ���������� abc
		System.out.println(softRef.get());

		String abc = new String("abc");
		WeakReference<String> weakRef = new WeakReference<>(abc);
		abc = null;
		System.gc();
		// ���������ռ� �������� null
		System.out.println(weakRef.get());

	}
}
