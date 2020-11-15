package t;

public class Division extends Binary{
	

	public Division(Expression first, Expression second) {
		super(first, second);
	}

	public int calculate(int first, int second) {
		return first / second;
	}
	
	public int rank() {
		return 1;
	}
	@Override
	public String toString () {
		return ("/");
	}


}
