package Week10_Lab;

import java.util.*;

public class SetToArray {

	public static void main(String[] args) {
		
Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			set.add(i);
		}
		
		
		int arr[] = new int[set.size()];
		
		Iterator<Integer> iterator = set.iterator();
		
		int index = 0;
		while(iterator.hasNext()){
			arr[index] = iterator.next();
			index++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
