package interpreter;

public abstract class OperatorExpression extends ArithmeticExpression {

	protected ArithmeticExpression mAriExpress1,mAriExpress2;
	@Override
	public int interpreter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 public OperatorExpression(ArithmeticExpression _arithmeticExpression1,
		      ArithmeticExpression _arithmeticExpression2) {
		 mAriExpress1 = _arithmeticExpression1;
		 mAriExpress2 = _arithmeticExpression2;
		  }


}
