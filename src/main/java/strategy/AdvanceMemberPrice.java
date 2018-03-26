package strategy;

public class AdvanceMemberPrice implements MemberStrategy{

	public double calPrice(double booksPrice) {
		// TODO Auto-generated method stub
		
		System.out.println("高级会员折扣口为0.8");
		return booksPrice*0.8;
	}

}
