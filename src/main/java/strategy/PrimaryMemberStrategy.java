package strategy;

public class PrimaryMemberStrategy implements MemberStrategy {

	public double calPrice(double booksPrice) {
		// TODO Auto-generated method stub
		
		System.out.println("初级会员没有折扣");
		return booksPrice;
	}

}
