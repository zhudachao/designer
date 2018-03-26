package builder;

public class Director {
	
	//当一个对象有多个部分时，可以将一个复杂对象的构建与它的表示分离，
	//使得同样的构建构成可以创建不同的表示
	
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	
	public void create(){
		builder.buildString();
		builder.buildCap();
		builder.buildCupBody();
		System.out.println("生产完毕。。。");
	}

	public static void main(String[] args) {
		Director d=new Director(new ClassCup());
		d.create();
	}
}
