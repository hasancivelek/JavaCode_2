package week11_1;

interface FunctINterface2{
	int sum (int a, int b);
}


public class Lambda_4 {

	
	
	public static void main(String[] args) {
		
FunctINterface2 reference=( n,  m) -> (n+m);{System.out.println(reference.sum(3, 9));}


	}

}
