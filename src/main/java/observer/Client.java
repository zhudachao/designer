package observer;

public class Client {
	
	//��ģ�����������۲��������������ϸ��Ϣ��
	//���ܹ۲����Ƿ���Ҫ�����͵���Ϣͨ������������ȫ���򲿷����ݡ�
	public static void main(String[] args) {
		ConcreteSubject sub=new ConcreteSubject();
		Observer obs=new ConcreteObserver();
		
		sub.attach(obs);
		sub.change("new state");
	}

}
