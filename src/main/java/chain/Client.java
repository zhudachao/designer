package chain;

public class Client {
	public static void main(String[] args) {
		
		//��װ������
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //�ύ����
        handler1.handleRequest();
	}
//������Ϊһ�����󣬸����������������ص���Ϣ������������Ľڵ����������󣬾����Ǵ����������ǰ����󷢸���һ���ڵ㡣
//������Ϊ����������Ľڵ�����������洢��Ҳ���������λ�ô洢�ģ�������ô��ȡ�������ʵ�֡�
}
