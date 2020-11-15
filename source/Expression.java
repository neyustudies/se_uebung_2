import java.util.Map;

public interface Expression {
	
	
	public int evaluate(Map<String, Integer> m) throws Exception; //weist variablen einen exakten Wert zu und rechnet die Expression aus
	
	public String toString();
	
	public int rank();
	
	
}
