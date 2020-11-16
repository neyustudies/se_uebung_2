package t;

import java.util.Map;

public class main {

	public static void main(String[] args) throws Exception {
		
		Expression e = new Addition(new Multiplication(
		        new Variable("a"), new Value(2)),
		        new Variable("b"));
		System.out.println(e); // a * 2 + b 
		System.out.println(e.evaluate(
		Map.of("a", 3, "b", 8))); // 14 
		Expression sub = new Division(new Variable("a"),
		        new Subtraction(new Variable("b"),
		                new Addition(new Variable("c"),
		                        new Variable("d"))));
		Expression add = new Division(new Variable("a"),
		        new Addition(new Variable("b"),
		new Addition(new Variable("c"), new Variable("d")))); 
		System.out.println(sub); // a / (b - (c + d))
		System.out.println(add); // a / (b + c + d)
	}
}
