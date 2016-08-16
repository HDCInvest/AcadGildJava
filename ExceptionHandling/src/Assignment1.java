
public class Assignment1 {

	public static void main(String[] args) {
		int myarray[] = {56,89,78,89,90};
		try{
			System.out.println("Array element is " + myarray[7] );
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Error:Array is out of bound");
		} finally {
			System.out.println("Assignment1 Completed");
		}

	}

}
