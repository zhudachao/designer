package chain;

public class Client {
	public static void main(String[] args) {
		
		//组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
	}
//请求作为一个对象，附带了这个请求处理相关的信息，组成责任链的节点会解读这个请求，决定是处理该请求或是把请求发给下一个节点。
//笔者认为这个责任链的节点可以是连续存储的也可以是随机位置存储的，具体怎么做取决于你的实现。
}
