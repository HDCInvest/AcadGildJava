
public class Assignment2 {

	public static void main(String[] args) {
		int num;
		try {
			num = Integer.parseInt("abc");
		} catch(NumberFormatException e) {
			System.out.println("Error:Input a proper string");
		}
		finally {
			System.out.println("Assignment2 Completed");
		}

	}

}
