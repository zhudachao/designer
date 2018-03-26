package builder;

public class Director {
	
	//��һ�������ж������ʱ�����Խ�һ�����Ӷ���Ĺ��������ı�ʾ���룬
	//ʹ��ͬ���Ĺ������ɿ��Դ�����ͬ�ı�ʾ
	
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	
	public void create(){
		builder.buildString();
		builder.buildCap();
		builder.buildCupBody();
		System.out.println("������ϡ�����");
	}

	public static void main(String[] args) {
		Director d=new Director(new ClassCup());
		d.create();
	}
}
