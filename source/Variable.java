package t;

import java.util.Map;

public class Variable extends Unary {
	
	public String name;
	
	
	public Variable(String string) {
		this.name = string;
	}


	public int evaluate(Map<String, Integer> m) throws CalcException  {
		if(!m.containsKey(name)) {
			throw new CalcException();
		}
		try {
			return m.get(name);	
		}
		catch(CalcException e) {
			System.out.println("Wert für eine Variable in der übergebenen Variablenbelegung nicht vorhanden.");
			e.printStackTrace();
			return 0;
		}
			
	}
	
	public int rank() {
		return 0;
	}
	@Override
	public String toString() {
		return (name);
	}


}
