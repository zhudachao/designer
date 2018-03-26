package interpreter;

public class NumExpression extends ArithmeticExpression {
	
	private int num;
	
	

	public NumExpression(int num) {
		super();
		this.num = num;
	}



	@Override
	public int interpreter() {
		// TODO Auto-generated method stub
		return num;
	}

}
