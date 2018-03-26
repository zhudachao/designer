package prototype_register;


public class Client {
	
	public static void main(String[] args) {
		
		 try{
	            Prototype p1 = new ConcreteProtype1();
	            PrototypeManger.setPrototype("p1", p1);
	            //��ȡԭ������������
	            Prototype p3 = PrototypeManger.getPrototype("p1").clon();
	            p3.setName("����");
	            System.out.println("��һ��ʵ����" + p3);
	            //���˶�̬���л���ʵ��
	            Prototype p2 = new ConcreteProtype2();
	            PrototypeManger.setPrototype("p1", p2);
	            //���»�ȡԭ������������
	            Prototype p4 = PrototypeManger.getPrototype("p1").clon();
	            p4.setName("����");
	            System.out.println("�ڶ���ʵ����" + p4);
	            //����ע�������ԭ��
	            PrototypeManger.removePrototype("p1");
	            //�ٴλ�ȡԭ������������
	            Prototype p5 = PrototypeManger.getPrototype("p1").clon();
	            p5.setName("����");
	            System.out.println("������ʵ����" + p5);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }

		
	
	

}
