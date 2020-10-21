package Week8;


public class EmployeTest {

	static void getEmployeeInfo(Employee reference){
		System.out.println(reference.getName());
		System.out.println(reference.getSSN());
		System.out.println(reference.getSalary());
		System.out.println(reference.CompanyName);
		
	}
	
	
	public static void main(String[] args) {
		Employee object =new Employee();
		Employee object1 =new Employee();
		
		object.setName("hasan");
		object.setSalary(34778.90);
		object.setSSN(34545444);
		//object.CompanyName="NAHAL";
		
		object1.setName("ihsan");
		object1.setSalary(2778.90);
		object1.setSSN(34545555);
		
		getEmployeeInfo(object);
		System.out.println("*******************");
		getEmployeeInfo(object1);
		
		//object.ShowInfo();
		//object1.ShowInfo();


	}

}
