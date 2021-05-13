package proxy;

public class ProxyObject extends AbstractObject {
	
	private RealObject realObject=new RealObject();

	public void operation() {
		
		System.out.println("before");
		
		realObject.operation();
		
		System.out.println("after");

	}

}
