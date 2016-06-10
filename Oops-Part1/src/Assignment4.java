
public class Assignment4 {
	
	public double answer ;
	
	public double ArthOperation(long num1, String Operation, long num2){
		
		switch (Operation) {
		case "+":
			answer =  Math.addExact(num1, num2);
			break;
		case "-":
			answer = Math.subtractExact(num1, num2);
			break;
		case "*":
			answer = Math.multiplyExact(num1, num2)	;
			break;
		case "/":
			answer = Math.floorDiv(num1, num2);
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}
		return answer;
	}
	
}
