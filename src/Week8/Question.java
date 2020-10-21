package Week8;

public class Question {

	public Question() {

		System.out.println("1");
	}

	public Question(int a) {
		this(42.98);
		System.out.println("2");

	}
	public Question(double a){
		this();
		System.out.println("3");
	}

	public static void main(String[] args) {
		
Question object= new Question(100);
	}

}
