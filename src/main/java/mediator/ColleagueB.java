package mediator;

public class ColleagueB extends AbstractColleague{

	@Override
	public void setNumber(int number, AbstractMediator mediator) {
		// TODO Auto-generated method stub
		this.number=number;
		mediator.BaffectA();
		
	}

}
