package Week7;
//R class, parent class, Super class, base class ;
class R{
	String bField;
	int bNumber;
	
void methodB (){
		System.out.println("this is Claas R method");
	}
}
//Q class child class Sub Class
public class ClassQ extends R {

	String AString;
	int ANumber;
	void methodA (){
		System.out.println("this is a Class Q method");
		
	}
	
	public static void main(String[] args) {
		ClassQ Qobject= new ClassQ();
		Qobject.AString="field in Class Q";
		Qobject.ANumber=7;
		Qobject.methodA();
        Qobject.methodB();

	}

}
