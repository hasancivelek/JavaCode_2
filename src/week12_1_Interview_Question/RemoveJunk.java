package week12_1_Interview_Question;

public class RemoveJunk {

	public static void main(String[] args) {
		

		// Extract latin characters, space and numbers out of this string
				String s = "Inte@#$23rview˚¬¨©ˆ∫©ç˜√∆µ Week 12345";
				
				s = s.replaceAll("[^a-zA-Z ]", "");
				
				System.out.println(s);
				
				String s2 = "Seleni12345um";
				s2 = s2.replaceAll("[^a-zA-Z]", "");
				System.out.println(s2);
	}
}
