  package week12_1_Interview_Question;

public class FindLargestAndSmallestArray {

	public static void main(String[] args) {
		
int arr[] = {1,2,3,6,7,8,999,1,2};
		
		// Find Largest int in array
		
		int largest = arr[0];
		int smallest = arr[0];
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} 
			else if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println("Smallest : " + smallest);
		System.out.println("Greatest : " + largest);			
	}		
		
//int[] arr={2,1,5,3,4};
//		
//		int largest=arr[0];
//		
//		for (int i = 0; i < arr.length-1; i++) {
//			
//			if(arr[i]>arr[i+1]){
//				largest=arr[i];
//			}
//		}
//		System.out.println(largest);

	//}

}
