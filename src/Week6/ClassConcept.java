package Week6;

//this example demonstrates using different constructors while instantiating object

public class ClassConcept {
	// fields
	int number;
	String word;

	// constructors

	public ClassConcept() {
		System.out.println("you used no parameter constructor..");
	}

	public ClassConcept(int number, String word) {

		this.number = number;
		this.word = word;
		System.out.println("you used 2 parameter constructor...");

	}

	// methods

	public static void main(String[] args) {

		ClassConcept objet1 = new ClassConcept(1, "hello");// we used 2 parameter const.
														 
		System.out.println(objet1.number + "  " + objet1.word);

		ClassConcept objet2 = new ClassConcept();// we used no parameter const.
		//objet2.number=4;
		//objet2.word="Selam";
		//System.out.println(objet2.number + "  " + objet2.word);
	}

}
