import java.util.Map;

public class Value extends Unary {
	
	public int v;
	
	public Value(int val) {
		this.v = val;
	}
	
	public int evaluate(Map<String, Integer> m) { //hier braucht man aber eigentlich dann die map nicht
		return v;
	}
	
	public int rank() {
		return 0;
	}
	
	public String toString() {
		return Integer.toString(v);
	}


}
