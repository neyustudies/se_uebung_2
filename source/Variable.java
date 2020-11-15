import java.util.Map;

public class Variable extends Unary {
	
	public String name;
	
	
	public Variable(String string) {
		this.name = string;
	}


	public int evaluate(Map<String, Integer> m) throws Exception { //TODO correct exception
		return m.get(name);
	}
	
	public int rank() {
		return 0;
	}


}
