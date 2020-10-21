package week_13_Interview_Question;


public class AlphabetCheck {
	public static void main(String[] args) {
	 // Check if the character is among a-z or A-Z
		
		char character = 'a';
		
		if ((character >= 'a' && character <='z') || (character>= 'A' && character <='Z')) {
			System.out.println("This is an alphabet");
		} else {
			System.out.println("This is not an alphabet");
		}
		
	}
}
