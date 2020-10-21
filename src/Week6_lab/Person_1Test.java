package Week6_lab;

public class Person_1Test {

	public static void main(String[] args) {
		Person_1 person = new Person_1();

		System.out.println(person.getFirstName()); //"undefined"
		System.out.println(person.getLastName());  //"undefined"
		System.out.println(person.getAge());       // -1
		System.out.println(person.toString());     //"undefined | undefined | -1"

		person.setFirstName("HASAN");
		person.setLastName("CIVELEK");
		person.setAge(43);

		System.out.println(person.toString() ); // "John | Doe | 44"

	}

}
