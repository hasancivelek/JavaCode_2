package week_13_Interview_Question;

public class FindPower {
	public static void main(String[] args) {
		
	    //find power of the integers
		//no built in methods
	
		int base=4 , power=3;	
		int result=1;
		
		for (int i = 1; i <= power; i++) {
			result=result*base;
		}
		System.out.println(result);
	}
}
