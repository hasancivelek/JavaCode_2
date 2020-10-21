package week_13_Interview_Question;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Silicone Labs";

		String reString = "";

		for (int i = 0; i < name.length(); i++) {
			reString += name.charAt(name.length() - i - 1);
		}

		System.out.println(reString);

		
		String a = "hasan";

		StringBuffer sd = new StringBuffer(a);

		System.out.println(sd.reverse());
	}
}
