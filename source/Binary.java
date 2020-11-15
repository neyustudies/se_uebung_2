package t;

import java.util.Map;

public abstract class Binary implements Expression{ 
	
	/* Die Rückgabetypen sind inkompatibel zu den 
	 * geerbten Methoden Expression.toString(), Object.toString()*/
	
	public Expression a; //Interfaces können scheinbar doch Attribute sein??
	public Expression b;

	public Binary(Expression first, Expression second) {
		this.a = first;
		this.b = second;
	};
	
	
	public abstract int calculate(int first, int second); //Overridden by base classes
	public abstract String getOperator();
	
	/*Die Methode evaluate(Map<String,Integer>) 
	 * vom Typ Expression bezieht sich auf den fehlenden Typ Map*/ //(??)
	public int evaluate(Map<String, Integer> m) throws Exception {
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
	
	@Override
	public String toString(){
		String output = "";
		if(this.rank() == 2){
			output+= "(";	
		}
		output+= this.a.toString() + " " + this.getOperator() + " " + this.b.toString();
		if(this.rank() == 2) {
			output+= ")";	
		}
		return output;
	}
		
	
}
