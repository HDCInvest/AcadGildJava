
public class Assignment4Test {
	public static void main(String[] args) {
		Assignment4 Calc = new Assignment4();
		System.out.println(Calc.ArthOperation(20, "+", 30));
		System.out.println(Calc.ArthOperation(200, "-", 30));
		System.out.println(Calc.ArthOperation(20, "*", 30));
		System.out.println(Calc.ArthOperation(290, "/", 30));
		System.out.println(Calc.ArthOperation(210, "=", 30)); //Why the switch statement doesn't exit here??
	}
	
}
