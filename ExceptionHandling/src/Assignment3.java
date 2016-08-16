
public class Assignment3 {

	public static void main(String[] args) {
		String a = null;
		
		try {
			a.toString();
		} catch (NullPointerException e) {
			System.out.println("Error:NullPointer exception due to usage of null object");
		}finally {
			System.out.println("Assignment3 Completed");
		}
	}

}
