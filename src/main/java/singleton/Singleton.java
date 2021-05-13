package singleton;

public class Singleton {

	//饿汉式
	private static final Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return singleton;
	}

	//懒汉式
	public static Singleton singleton2 = null;

	public static synchronized Singleton getSingleton() {

		if (singleton2 == null) {
			singleton2 = new Singleton();
		}
		return singleton2;
	}

}
