package mediator;

public class ColleagueA extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator mediator) {
		// TODO Auto-generated method stub
		this.number=number;
		mediator.AaffectB();
	}

}
