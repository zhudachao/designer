package observer;

public class Client {
	
	//推模型主题对象向观察者推送主题的详细信息，
	//不管观察者是否需要，推送的信息通常是主题对象的全部或部分数据。
	public static void main(String[] args) {
		ConcreteSubject sub=new ConcreteSubject();
		Observer obs=new ConcreteObserver();
		
		sub.attach(obs);
		sub.change("new state");
	}

}
