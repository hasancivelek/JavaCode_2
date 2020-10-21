package Week6_lab;

/*REPL IT LAB 3 QUESTION
 * Person class has following attributes:
 
 - private String instance variables: firstName, lastName 
- private int instance variable: age
Methods:  
- getter and setter methods for each instance variable. try to use this. keyword    
 -   toString method.No parameters and Returns(does not print! 
 no println in the method!) person info in this format: "firstName | lastName | age"

Constructors:

1) No-Args constructor -sets default values for the Person object name and lastName => "undefined" age => -1

2) 3-Args  Constructor: - accepts firstName, lastName, age parameters and assigns values 
to encapsulated instance variable try to use this. keyword
 */
public class Person_1 {
	private String firstName, lastName;
	private int age;

	Person_1() {
		this.firstName = "undefined";
		this.lastName = "undefined";
		this.age = -1;

	}

	Person_1(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	int getAge() {
		return age;
	}

	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}

	public String toString() {
		return firstName + " | " + lastName + " | " + age;
	}

}
