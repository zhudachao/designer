package strategy;

public class MiddleMemberPrice implements MemberStrategy{

	public double calPrice(double booksPrice) {

        System.out.println("�м���Ա���Ϊ90%");
		return booksPrice*0.9;
	}

}
