package calc;

import java.util.Map;

public abstract class Binary implements Expression{ 
	
	public Expression a;
	public Expression b;

	public Binary(Expression first, Expression second) {
		this.a = first;
		this.b = second;
	};
	
	
	public abstract int calculate(int first, int second); //Overridden by base classes
	public abstract String getOperator();
	
	
	public int evaluate(Map<String, Integer> m)  { //
		try {
			int first = a.evaluate(m); 
			int second = b.evaluate(m);
			return this.calculate(first, second);
		}
		catch(CalcException e){
			System.out.println("Wert für eine Variable in der übergebenen Variablenbelegung nicht vorhanden.");
			e.printStackTrace();
			return 0;
		}	
	}
	
	@Override
	public String toString() {
		String output = "";
        if(a.rank() >= this.rank() && !(this instanceof Associative && a instanceof Associative)) {
            output += "(" + a.toString() + ")";
        } else {
            output += a.toString();
        }
        output += " " + this.getOperator() + " ";
        if(b.rank() >= this.rank() && !(this instanceof Associative && b instanceof Associative)) {
            output += "(" + b.toString() + ")";
        } else {
            output += b.toString();
        }

        return output;
		
	}
		
	
}
