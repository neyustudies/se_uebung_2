package calc;

public class Subtraction extends Binary{

	public Subtraction(Expression first, Expression second) {
		super(first, second);
	}

	@Override //abstract method
	public int calculate(int first, int second) {
		return first - second;
	}
	
	public int rank() {
		return 2;
	}
	
	@Override //abstract method
	public String getOperator() {
		return ("-");
	}

}
