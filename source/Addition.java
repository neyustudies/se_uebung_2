package calc;

public class Addition extends Binary implements Associative {
	
	/* Die Rückgabetypen sind inkompatibel zu den geerbten Methoden 
	 * Expression.toString(), Object.toString()*/
	
	public Addition(Expression first, Expression second) {
		super(first, second);
	}
	
	@Override //abstract method
	public int calculate(int first, int second) {
		return first + second;
	}
	
	public int rank() {
		return 2;
	}
	
	@Override //abstract method
	public String getOperator() {
		return ("+");
	}
}
