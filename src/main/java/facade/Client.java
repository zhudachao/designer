package facade;

public class Client {
	public static void main(String[] args) {
		
		Computer computer=new Computer();
		computer.start();
		computer.close();
	}
	//���ģʽ��Facade Pattern������ϵͳ�ĸ����ԣ�����ͻ����ṩ��һ���ͻ��˿��Է���ϵͳ�Ľӿڡ�
	//�������͵����ģʽ���ڽṹ��ģʽ���������е�ϵͳ���һ���ӿڣ�������ϵͳ�ĸ����ԡ�

}
