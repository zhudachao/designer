package singleton;

/**
 * 单例双重锁
 * @author zdchao
 *
 */
public class Singleton2 {
	
	private Singleton2(){}
	
	private static volatile Singleton2 instance=null;
	
	public static Singleton2 getInstance() {
		if(instance==null) {
			synchronized (instance) {
				instance =new Singleton2();
			}
		}
		return instance;
	}	
	

}
