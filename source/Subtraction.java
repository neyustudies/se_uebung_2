package t;

public class Subtraction extends Binary{

	public Subtraction(Expression first, Expression second) {
		super(first, second);
	}

	public int calculate(int first, int second) {
		return first - second;
	}
	
	public int rank() {
		return 2;
	}
	@Override
	public String toString () {
		return ("-");
	}

}
