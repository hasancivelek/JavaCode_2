package week12_1_Interview_Question;

public class PalindromeNumber {

	public static void main(String[] args) {
		// eg. 121, 1234321, 333
		int number = 999;
		int r = 0;
		int sum = 0;
		int t;
		
		t = number;
		
		while(number>0){
			r = number %10; // gets the last digit
			sum = (sum*10) + r;
			number = number/ 10;
		}
		
		if (t== sum) {
			System.out.println("This is palindrome");
		}
		else {
			System.out.println("This is not palindrome");
		}
		
		
		
		
//		int x=12321;
//		String string=String.valueOf(x);
//		System.out.println(string);
//		
//		StringBuilder s = new StringBuilder("");
//		s.append(string);
//		if(s.equals(s.reverse())){
//			System.out.println("The number is a palindrome number");
//		}
//		else{
//			System.out.println("The number is not a palindrome number");
//		}

//		int num = 12345;
//		String number = String.valueOf(num);
//		String reversed = "";
//		for(int i = number.length()-1; i>=0; i--){
//			reversed += number.charAt(i);
//		}
//		
//		System.out.println(reversed);
//		
//		if(number.equals(reversed)){
//			System.out.println(number + " is palindrome");
//		} else {
//			System.out.println(number + " is not palindrome");
//		}
		
		
		
		
	}

}
