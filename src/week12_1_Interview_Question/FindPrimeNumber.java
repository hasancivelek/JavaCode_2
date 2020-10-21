package week12_1_Interview_Question;

public class FindPrimeNumber {

	public static void main(String[] args) {
		
		int num =10;
		if (num > 0){
			if(num %2 == 1){
				System.out.println("number is prime " );
			}
			else{
				System.out.println("number is not prime");
			}
		}
		
//		int n=10;
//		int howManyTimes = 0;
//		if (n > 2) {
//			for (int i = 1; i <= n; i++) {
//				if (n % i == 0) 
//					howManyTimes++; 
//			}
//		}
//		if(howManyTimes==2|| n==2){
//			System.out.println(n+ "is prime");
//		}
//		else{
//			System.out.println(n+ "is not prime");
//		}
	}

}
