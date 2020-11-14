import java.util.Map;

public abstract class Binary implements Expression{ 
	public Expression a; //Interfaces können scheinbar doch Attribute sein??
	public Expression b;
	
	
	public abstract int calculate(int first, int second); //Overridden by base classes
	
	
	public int evaluate(Map<String, Integer> m) {
		int first = a.evaluate(m);
		int second = b.evaluate(m);
		
		/*if(this.a instanceof Binary) {
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
		}*/
		
		return this.calculate(first, second);
	}
		
	
}
