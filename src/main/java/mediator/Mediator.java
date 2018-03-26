package mediator;

public class Mediator extends AbstractMediator {

	public Mediator(AbstractColleague a, AbstractColleague b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AaffectB() {
		// TODO Auto-generated method stub
		int number=A.getNumber();
		B.setNumber(number*100);
	}

	@Override
	public void BaffectA() {
		int number=B.getNumber();
		A.setNumber(number*100);
		
	}

}
