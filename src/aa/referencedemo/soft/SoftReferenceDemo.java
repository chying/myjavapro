package aa.referencedemo.soft;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/**
 * ������ �ڴ治��ʱ ���� ΢�� ����
 * 
 * @author chying
 *
 */
public class SoftReferenceDemo {
	static Map<String, String> map = new HashMap<>();
	static {

	}

	public static void main(String[] args) {
		String str = new String("abc");
		SoftReference<String> softRef = new SoftReference<>(str);
		str=null;
		System.gc();
		System.out.println();
	}
}
