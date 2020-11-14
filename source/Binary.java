import java.util.Map;

public abstract class Binary implements Expression{ 
	public Expression a; //Interfaces können scheinbar doch Attribute sein??
	public Expression b;
	
	public int evaluate(Map<String, Integer> m) {
		int first = 0;
		int second = 0;
		if(this.a instanceof Binary) {
			first = a.evaluate(m);
		}
		if(this.a instanceof Unary) {
			first = a.evaluate(m);
		}
		if(this.b instanceof Binary) {
			second = b.evaluate(m);
		}
		if(this.b instanceof Unary) {
			second = b.evaluate(m);
		}
		return first; //eigentlich müsste hier auch second zurückgegeben werden..
	}
		
	
}
