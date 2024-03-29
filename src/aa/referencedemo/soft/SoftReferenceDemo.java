package aa.referencedemo.soft;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/**
 * 软引用 内存不足时 回收 微博 文章
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
		//可以输出结果 abc
		System.out.println(softRef.get());
		
		String abc = new String("abc");
		WeakReference<String> weakRef = new WeakReference<>(abc);
		abc=null;
		System.gc();
		//进行垃圾收集 ，输出结果 null
		System.out.println(weakRef.get());
		
	}
}
