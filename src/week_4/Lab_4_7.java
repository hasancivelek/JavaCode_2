package week_4;

public class Lab_4_7 {

	public static void main(String[] args) {
// Write a loop to draw this pattern, space between dollar signs increase by one at every line.	
		
		String a,b, space;
		space = "";
		a = "$"; 
		b = "$";
		for (int i = 0; i < 6; i++) {
			System.out.println(a+space+ b);
			space = space + " ";
			
		}

	}

}
