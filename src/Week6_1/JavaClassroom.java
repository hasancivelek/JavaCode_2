package Week6_1;

//this exsmple demonstrates static concept
//static fields class level fields
//static value will be shared among the object
public class JavaClassroom {

	String studentName;
	int studentID;
	static String teacherName;

	public static void main(String[] args) {

		JavaClassroom student1 = new JavaClassroom();
		student1.studentName = "James";
		student1.studentID = 4298;

		JavaClassroom student2 = new JavaClassroom();
		student1.studentName = "Bond";
		student1.studentID = 4299;
		 student1.teacherName="ilhan";
		JavaClassroom.teacherName = "Ahmet";
		 //student1.teacherName="ilhan";
		System.out.println(student1.teacherName);
		System.out.println(student2.teacherName);

	}

}
