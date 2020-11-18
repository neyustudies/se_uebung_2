package calc;

import java.util.Map;

public class Value extends Unary {
	
	public int v;
	
	public Value(int val) {
		this.v = val;
	}
	
	public int evaluate(Map<String, Integer> m) {
		return v;
	}
	
	public int rank() {
		return 0;
	}
	@Override
	public String toString() { 
		return (Integer.toString(v));
	}


}
