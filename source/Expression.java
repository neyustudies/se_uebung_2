import java.util.Map;

public interface Expression {
	
	
	public int evaluate(Map<String, Integer> m);
	
	public String toString();
	
	public void rank();
	
	
}
