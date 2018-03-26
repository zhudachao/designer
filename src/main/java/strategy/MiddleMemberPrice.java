package strategy;

public class MiddleMemberPrice implements MemberStrategy{

	public double calPrice(double booksPrice) {

        System.out.println("中级会员则口为90%");
		return booksPrice*0.9;
	}

}
