package week12_1_Interview_Question;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		
//int arr[]= {1,3,4,4,5,8,5};

		String arr []={"nihal","ihsan","nihal"};

for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i].equals( arr[j])){
			System.out.println(arr[j]);
				}	
			}	
		}
	}
}
