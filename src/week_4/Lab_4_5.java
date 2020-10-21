package week_4;

public class Lab_4_5 {

	public static void main(String[] args) {
	/*
	 * Write a loop to draw this pattern: 	
		******* 
		****** 
		***** 
		**** 
		***						
		** 
		* 
	*/
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	}

}
