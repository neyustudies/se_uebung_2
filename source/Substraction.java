public class Substraction extends Binary{

	public Substraction(Expression first, Expression second) {
		super(first, second);
	}

	public int calculate(int first, int second) {
		return first - second;
	}
	
	public int rank() {
		return 2;
	}
	
	public String toString() {
		return super.toString();
	}

}
