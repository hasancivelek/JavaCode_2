package Week7;

import java.util.Arrays;

//We are using inheritance concept to categorize the classes
//Hierarchial Inheritance
class Employee {
	String name;
	int salary;
	int sickDays;

	int studentNumbers;

	String certificates[];
	
	int numberOfChildren;

}

class QAEnginer extends Employee {
	String[] certificates;

}

class HouseWife extends Employee {
	int numberOfChildren;
	
}

class Teacher extends Employee {
	int studentNumbers;
	

}

// public class needs their own file
public class InherintanceConcept2 {

	public static void main(String[] args) {
		HouseWife houseWife = new HouseWife();
		houseWife.name = "Myra";
		houseWife.sickDays = 0;
		houseWife.numberOfChildren = 3;
		System.out.println(houseWife.name+"\n"+houseWife.sickDays+"\n"+houseWife.numberOfChildren);
		QAEnginer enginer = new QAEnginer();
		enginer.name = "hasan";
		enginer.salary = 5000;
		enginer.sickDays = 13;
		String[] QACertificates = { "java", "python", "scrum " };
		enginer.certificates = QACertificates;
		
		System.out.println(enginer.name+"\n"+enginer.salary+"\n"+enginer.sickDays);
		System.out.println(Arrays.toString(QACertificates));

	}
}
