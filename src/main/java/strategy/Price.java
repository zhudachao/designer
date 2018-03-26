package strategy;

public class Price {
	
	public MemberStrategy strategy;
	
	//构造函数
	public Price(MemberStrategy Strategy){
		this.strategy=Strategy;		
	}
	
	//计算图书价格
	public double quote(double booksPrice){
		return this.strategy.calPrice(booksPrice);
	}
	
	

}
