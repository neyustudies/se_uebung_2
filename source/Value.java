import java.util.Map;

public class Value extends Unary {
	
	public int v;
	
	
	public int evaluate(Map<String, Integer> m) { //hier braucht man aber eigentlich dann die map nicht
		return v;
	}
	
	public int rank() {
		return 0;
	}


}
