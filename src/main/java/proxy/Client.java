package proxy;

public class Client {
	
	//�ͻ��˲���ֱ������һ�����󣬶�ʹ��һ����������Ŀ�����
	//����ĳЩ����
	
	public static void main(String[] args) {
		
		AbstractObject proxy=new ProxyObject();
		
		proxy.operation();
	}

}
