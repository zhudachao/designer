package strategy;

public class Price {
	
	public MemberStrategy strategy;
	
	//���캯��
	public Price(MemberStrategy Strategy){
		this.strategy=Strategy;		
	}
	
	//����ͼ��۸�
	public double quote(double booksPrice){
		return this.strategy.calPrice(booksPrice);
	}
	
	

}
