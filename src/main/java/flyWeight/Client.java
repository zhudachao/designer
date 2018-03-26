package flyWeight;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly1 = factory.factory(new String("��������"));
        fly1.operation("���ߵ��");

        Flyweight fly2 = factory.factory(new String("ţ��"));
        fly2.operation("��˼Զ���");

        Flyweight fly3 = factory.factory(new String("��������"));
        fly3.operation("���ߵ��");

        System.out.println(fly1==fly3);
        System.out.println("���㲻ͬ�Ĳ˵ĸ���"+factory.getFlyweightSize());

	}
	
	

}
