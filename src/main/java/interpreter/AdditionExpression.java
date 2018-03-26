package interpreter;

public class AdditionExpression extends OperatorExpression {

	public AdditionExpression(ArithmeticExpression _arithmeticExpression1,
			ArithmeticExpression _arithmeticExpression2) {
		super(_arithmeticExpression1, _arithmeticExpression2);
		// TODO Auto-generated constructor stub
	}
	 public int interpreter() {
	    return mAriExpress1.interpreter() + mAriExpress2.interpreter();
	  }
}
