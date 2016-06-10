import java.util.Random;
import java.util.Scanner;

public class Assignment3 {
	public int UpperLimit ;
	public Assignment3() {
		System.out.println("Type a positive number?");
		Scanner sc = new Scanner(System.in);
		UpperLimit = sc.nextInt();
		sc.close();
	}
	public int GenRandomNum(){
		Random rn = new Random();
		return rn.nextInt(UpperLimit);
	}
}
