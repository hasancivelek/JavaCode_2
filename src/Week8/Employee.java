package Week8;


public class Employee {

	private double salary;
	private int SSN;
	public String name;
	public static String CompanyName="Silicone Labs";

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/*void ShowInfo(){
		System.out.println("name"+name);
		System.out.println("SSn"+SSN);
		System.out.println("Salary"+salary);
	}
	bu kismi ben yazdim
*/
	

}
