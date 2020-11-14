import java.util.Map;

public class Variable extends Unary {
	
	public String name;
	
	
	public int evaluate(Map<String, Integer> m) {
		return m.get(name);
	}
	
	public int rank() {
		return 0;
	}


}
