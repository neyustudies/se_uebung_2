package calc;

import java.util.Map;

public interface Expression {
	
	
	public int evaluate(Map<String, Integer> m) throws CalcException;
	
	public String toString();
	
	public int rank();
	
	
}
