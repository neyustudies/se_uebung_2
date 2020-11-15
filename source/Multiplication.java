public class Multiplication extends Binary{

	public Multiplication(Expression first, Expression second) {
		super(first, second);
	}

	public int calculate(int first, int second) {
		return first * second;
	}
	
	public int rank() {
		return 1;
	}

}
