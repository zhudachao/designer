package others;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author zdchao
 *
 */
public class StaticDemo {
	
	static {
		a = 10;
		b = 20;
		str = "static demo";
	}

	private static int a =1;
	private static int b =2;
	private static String str;

//	static {
//		a = 10;
//		b = 20;
//		str = "static demo";
//	}
	
	/**
	 * 静态代码块的位置不同，对变量重新赋值或初始化；静态代码块对在程序启动时执行，和静态变量的加载顺序由编写顺序决定
	 * 静态块（静态变量）->成员变量->构造方法-> (静态)普通方法
	 * 静态和非静态： 先执行父类成员变量和构造函数，再执行子类成员变量和构造函数
	 * @param args
	 */
	
	public static void main(String[] args) {
//		System.out.println(StaticDemo.a);
//		System.out.println(StaticDemo.b);
//		System.out.println(StaticDemo.str);
		
		String [] strArray =new String[] {"a","b"};
		List strList =(List) Arrays.asList(strArray);
//		strList.add("001");  //UnsupportedOperationException		
		
		System.out.println(strList);
	}

}
