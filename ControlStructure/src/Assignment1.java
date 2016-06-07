import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		int age ;
		System.out.println("What is your age?");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		sc.close();
		if(age >= 18)
		{
			System.out.println("You are elgible to vote");
		}
		else
			System.out.println("You are NOT elgible to vote");
			
	}

}
