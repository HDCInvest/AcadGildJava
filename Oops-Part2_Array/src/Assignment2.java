import java.util.Arrays;

public class Assignment2 {

	public static void main(String[] args) {
		int OldArray[] = {5,6,4,3,-9};
		int NewArray[] = new int[OldArray.length + 1];
		
		Arrays.sort(OldArray);
		System.out.println("Sorted Array");
		for (int i = 0; i < OldArray.length; i++) {
		NewArray[i] = OldArray[i];
		System.out.println(OldArray[i]);
		}
		
		System.out.println("Sorted Array with element");
		NewArray[OldArray.length] = 1111;
		for (int i = 0; i < NewArray.length; i++) {
			System.out.println(NewArray[i]);
			}
		

	}

}
