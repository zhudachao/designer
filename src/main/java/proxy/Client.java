package proxy;

public class Client {

	
	public static void main(String[] args) {
		
		AbstractObject proxy=new ProxyObject();
		
		proxy.operation();
	}

}
