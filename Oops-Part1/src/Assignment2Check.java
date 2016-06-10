import java.util.Scanner;

public class Assignment2Check {

	public static void main(String[] args) {

		System.out.println("Type a positive number?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("Statement that the number you typed above is Prime Number -> is " + Assignment2.checkPrime(num));

	}

}
