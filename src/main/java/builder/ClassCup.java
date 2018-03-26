package builder;

public class ClassCup extends Builder{

	@Override
	public void buildString() {
		// TODO Auto-generated method stub
		cup.setString("生产绳子。。。");
		System.out.println("生产绳子。。。");
	}

	@Override
	public void buildCap() {
		// TODO Auto-generated method stub
		cup.setCap("生产杯盖。。。");
		System.out.println("生产杯盖。。。");
	}

	@Override
	public void buildCupBody() {
		// TODO Auto-generated method stub
		cup.setCupBody("生产杯体。。。");
		System.out.println("生产杯体。。。");
	}
	
	

}
