package proxy;

public class Client {
	
	//客户端不能直接引用一个对象，而使用一个代理对象对目标对象、
	//进行某些操作
	
	public static void main(String[] args) {
		
		AbstractObject proxy=new ProxyObject();
		
		proxy.operation();
	}

}
