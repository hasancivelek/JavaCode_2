package week_4;

public class Lab_4_3 {

	public static void main(String[] args) {
		//create an array and assign 10 different elements.
		//Loop through the array and search for 100,
		//If you can find 100 inside of the array, print : "value found at index "+index
		//if that search value is not found print "100 not found in the array"
		//After you find 100 then exit the loop(break statement) at that point, we are looking for
		//only the first 100. not all of them

		int []myArray={10,100,20,30,40,50,60,70,80,90};
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]==100) {
				System.out.println("Value found at index " + i);
				break;
				
			}
			else {
				System.out.println("100 not found in the array");
			}
		}
		
		
		

	}

}
