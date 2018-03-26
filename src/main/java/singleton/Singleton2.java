package singleton;

//懒汉式
public class Singleton2 {
	
	private Singleton2(){}
	
	private static Singleton2 single=null;
	
	//方式1 ：添加同步synchronize
//	private synchronized static Singleton2 getInstance(){
//		if(single==null){
//			single=new Singleton2();
//		}
//		return single;
//	} 
	
	//方式2  双重检查锁定
//	public static Singleton2 getInstance(){
//		if(single==null){
//			synchronized (Singleton2.class) {
//				if(single==null){
//					single=new Singleton2();
//				}			
//			}
//		}
//		return single;
//	}
	
	//方式3  静态内部类实现
	private static class LazyHolder{
		private static final Singleton2 INSTANCE=new Singleton2();
	}
	public static final Singleton2 getInstance(){
		return LazyHolder.INSTANCE;
	}
	

}
