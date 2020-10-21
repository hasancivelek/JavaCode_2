 package Week7_1;

class Student{
	int number;
	String name,course;
	float tuition;
	
	public Student(int number, String name, float tuition) {
	
		this.number = number;// this key word  is acts as reference to the object
		this.name = name;
		this.tuition = tuition;
		//System.out.println("Number : " + number + "\n " + "name : " + name +"\n" +	"tuition : " + tuition);
	}

	public Student(int number, String name, float tuition,String course) {
		//we can use this() in order to invoke constructors in the same class
		
		this(number, name, tuition);//we are reusing 3 parameter constructor
		this.course=course;
		System.out.println("Number : " + number + "\n " + "name : " + name +"\n" + "tuition : " + tuition + "\n" + "Course : " + course);
	
}
}





public class ThisKeyWordConcept {

	public static void main(String[] args) {
		
		Student student2 = new Student(4299, "Mike", 4000, "Assembly Language");
		Student student1 = new Student(4298, "Ahmet", 40000);

	}

}
