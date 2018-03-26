package expression;

public class AndExpression implements Expression{
	
	private Expression expr1;
	private Expression expr2;
	

	public AndExpression(Expression expr1, Expression expr2) {
		super();
		this.expr1 = expr1;
		this.expr2 = expr2;
	}


	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return expr1.interpret(context)&&expr2.interpret(context);
	}

}
