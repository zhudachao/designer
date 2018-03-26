package singleton;

//����ʽ
public class Singleton2 {
	
	private Singleton2(){}
	
	private static Singleton2 single=null;
	
	//��ʽ1 �����ͬ��synchronize
//	private synchronized static Singleton2 getInstance(){
//		if(single==null){
//			single=new Singleton2();
//		}
//		return single;
//	} 
	
	//��ʽ2  ˫�ؼ������
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
	
	//��ʽ3  ��̬�ڲ���ʵ��
	private static class LazyHolder{
		private static final Singleton2 INSTANCE=new Singleton2();
	}
	public static final Singleton2 getInstance(){
		return LazyHolder.INSTANCE;
	}
	

}
