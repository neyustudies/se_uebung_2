package calc;

public class Multiplication extends Binary implements Associative {

	public Multiplication(Expression first, Expression second) {
		super(first, second);
	}

	@Override //abstract method
	public int calculate(int first, int second) {
		return first * second;
	}
	
	public int rank() {
		return 1;
	}
	
	@Override //abstract method
	public String getOperator() {
		return ("*");
	}

}
