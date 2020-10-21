package Week11_lab;

public class Test_22 {

	public static void main(String[] args) {
		
String myArray[]={"ahmet","hasan","hasan","huseyin"};

for(int i=0; i<myArray.length; i++){
	for(int j=i+1; j<myArray.length; j++){
		if(myArray[i].equals(myArray[j])){
			System.out.println(myArray[i]);
		}
	}
}
	}

}
