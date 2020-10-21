package week5;

public class Recap_5 {

	public static int method1(int a){
		System.out.println("this method starting to work");
		System.out.println("we are adding 10 into our parameter");
		a=a+10;
		System.out.println("we are returing a");
		return a;
	}
	////////////////////////////
	boolean a= false;
	static boolean isEven(int a){
		if(a%2==0){
			return true;
		}
		else{
			return false;
		}
		}
	////////////////////////////////////
	
	
	public static void main(String[] args) {
		int number=method1(10)+10;
  System.out.println(number);
//////////////////////////////	
  System.out.println(isEven(10));
	
	}

}
