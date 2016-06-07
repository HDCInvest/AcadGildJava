
public class Assignment2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int isPrime = 1 ;
			for (int j = 2; j < i; j++) {
				if (i%j == 0 ) isPrime = 0 ;
			}
			if (isPrime == 1 ) System.out.print(" "+i);; 
		}


	}

}
