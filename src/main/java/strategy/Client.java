package strategy;

public class Client {
	public static void main(String[] args) {
		
		//高级折扣
		MemberStrategy strategy=new AdvanceMemberPrice();
		Price price =new Price(strategy);
	
		
		double quote=price.quote(300);
		
		System.out.println("图书的最终价格唯："+quote);
		
	}

}
