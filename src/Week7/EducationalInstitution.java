package Week7;
//repl it inheritance question 1
public class EducationalInstitution {
	private int years;
	int a;

	public EducationalInstitution(int years) {
		this.years = years;
	}

	public EducationalInstitution() {
		this(7);

	}

	public String graduationRequirements() {
		return years + " years of study";
	}

}

class LawSchool extends EducationalInstitution {

	// Your code here

	public LawSchool() {
		super();

	}

	public LawSchool(int years) {
		super(years);

	}

	@Override
	public String graduationRequirements() {
		return super.graduationRequirements() + " and passing the bar";
	}

	public static void main(String[] args) {
		EducationalInstitution obj = new EducationalInstitution();
	//System.out.println(	obj.graduationRequirements());

	}
}