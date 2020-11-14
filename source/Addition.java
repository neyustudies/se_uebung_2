
public class Addition extends Binary{
	
	/* Die Rückgabetypen sind inkompatibel zu den geerbten Methoden 
	 * Expression.toString(), Object.toString()*/
	
	public Addition(Expression first, Expression second) {
		super(first, second);
	}

	public int calculate(int first, int second) {
		return first + second;
	}
	
	public int rank() {
		return 2;
	}

}
