package week_13_Interview_Question;

public class SwapVariables {

	public static void main(String[] args) {
		
int x= 10 , y=20;

int temp=x;
x=y;
y=temp;

System.out.println(x+" "+y);

//swap again without temporary variable

x=x-y;
y=x+y;
x=y-x;

System.out.println(x+" "+y);

	}

}
