
public class Assignment4 {

	public static void main(String[] args) {
		String name = "AcadGild";
		
		try {
			System.out.println("An word in the name is " + name.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error:String out of bound ");
		}finally {
			System.out.println("Assignment4 Completed");
		}
	}

}