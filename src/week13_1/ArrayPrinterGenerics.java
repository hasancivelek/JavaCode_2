package week13_1;

public class ArrayPrinterGenerics {
	
	
	static<E> void printArray(E[] inputArray){
		for(E element : inputArray){
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		
Integer arr[]={1,2,3,4};
String arr1[]={"hasan","zuhal"};


printArray(arr);
printArray(arr1);

	}

}
