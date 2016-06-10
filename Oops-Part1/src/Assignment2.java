
public class Assignment2 {
	
	
	int num ;
	
	
	static boolean checkPrime (int num )
	{
		if(num%2 == 0) return false;
		
		for(int i=3; i*i <= num; i=i+2)
		{
			if(num%i == 0)
				return false;
		}
		return true;
	}
}
