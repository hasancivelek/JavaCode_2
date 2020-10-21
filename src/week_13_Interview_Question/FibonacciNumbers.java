package week_13_Interview_Question;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
int a=0;
int b=1;
int number =12;
for(int i=1; i<=number; ++i){
	System.out.print(a +" ");
	int sum =a+b;
	a=b;
	b=sum;
		}
	}
}
