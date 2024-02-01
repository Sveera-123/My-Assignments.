package week2day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
	
		int num =13;
		int count=0;
		//boolean isPrime= true;
		for (int i = 1; i<=num; i++) {
			//System.out.println(i);
			if (num %i==0) {
				count++;
				//isPrime=false;
				//break;		
			}
			
			
		}
		
		if(count==2) {
			System.out.println("its a prime");
		}else {
			System.out.println("not a prime");
		}
		
	}

}
