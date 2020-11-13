import java.util.Map;

public abstract class Binary implements Expression{ 
	public Unary a;
	public Unary b;
	
	public int evaluate(Map<String, Integer> m) {
		if(this.a instanceof Variable) {
			a = m.get(a.name);
		}
		m.get(key)
	}
		
	
}
