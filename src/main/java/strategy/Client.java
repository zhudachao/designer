package strategy;

public class Client {
	public static void main(String[] args) {
		
		//�߼��ۿ�
		MemberStrategy strategy=new AdvanceMemberPrice();
		Price price =new Price(strategy);
	
		
		double quote=price.quote(300);
		
		System.out.println("ͼ������ռ۸�Ψ��"+quote);
		
	}

}
