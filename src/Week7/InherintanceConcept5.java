package Week7;

class Book {
	String title = "Angeles and Demons";
	String author = "Dan Brown";
	int price = 15;

}

class PaperBackBook extends Book {
	int pages = 300;

	void read() {
		System.out.println("you are reading the book , it has " + pages + " pages");
		System.out.println("you are reading the book, title :" + title);
		System.out.println("yoe are reading the book ,author: " + author);
		System.out.println("the book price is " + price+"$");
	}
}

class AudioBook extends Book {
	int lenght = 10;

	void play() {
		System.out.println("you are listening AudioBook, it will last " + lenght + " hours");
	}
}

class EBook extends Book {
	int size = 20;

	void open() {
		System.out.println("you are downloading Ebook version , size is  " + size + "MB");
	}
}

public class InherintanceConcept5 {

	public static void main(String[] args) {

		AudioBook audioBook = new AudioBook();
		audioBook.play();
		PaperBackBook paperBackBook = new PaperBackBook();
		paperBackBook.read();

	}

}
