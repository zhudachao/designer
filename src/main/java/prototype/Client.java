package prototype;


public class Client {
	
	private Prototype prototype;
    /**
     * ���췽����������Ҫʹ�õ�ԭ�ͽӿڶ���
     */
    public Client(Prototype prototype){
        this.prototype = prototype;
    }
    public void operation(Prototype example){
        //��Ҫ����ԭ�ͽӿڵĶ���
        Prototype copyPrototype = (Prototype) prototype.clone();
        
    }
}