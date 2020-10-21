package week13_1;

class TwoValue<E,U>{
	
	E e;
	U u;
	public TwoValue(E e, U u) {
		
		this.e = e;
		this.u = u;
	}
	public E getE() {
		return e;
	}
	public void setE(E e) {
		this.e = e;
	}
	public U getU() {
		return u;
	}
	public void setU(U u) {
		this.u = u;
	}
	
	}
	

public class GenericClasses2 {
	

	public static void main(String[] args){
		
		TwoValue<Integer,String> obj = new TwoValue<Integer,String>(42, "Java");
	obj.setE(34);
	obj.setU("hasan");
		System.out.println(obj.e +obj.u);
	}
}
