package Zuhal;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayExmple {

	public static void main(String[] args) {
		
		
	/////   FIND DUPLICATE ELEMENT IN ARRAY   /////
	
	int[] array={1,4,4,5,7,3,7,9,8,3};
	String[] array1={"zuhal","nihal","zuhal","nihal"};
	
	for(int i=0;i<array.length;i++){
		for(int j=i+1;j<array.length;j++){
			if(array[i]==array[j]){
				System.out.println("This number is duplicated in this array = "+array[i]);
			}}}
	for(int i=0;i<array1.length;i++){
		for(int j=i+1;j<array1.length;j++){
			if(array1[i]==array1[j]){
				System.out.println("This strings are duplicated = "+array1[i]);
			}}}
	
																	/////	FIND LARGEST AND SMALLEST ELEMENT IN ARRAY	/////
																	
																	int[] arr={2,45,65,3,1250};
																	int large=arr[0];
																	int small=arr[0];
																	
																	for(int i=0;i<arr.length;i++){
																		if(arr[i]>large){
																			large=arr[i];
																		}
																	}
																	System.out.println("The largest number of array is = "+large);
																	
																	for(int i=0;i<arr.length;i++){
																		if(arr[i]<small){
																			small=arr[i];
																		}
																	}
																	System.out.println("The smallest number of array is = "+small);
	
	/////	FINDING MISSING NUMBER	/////
	
	int[] arr1={1,2,3,5,6,7,12,15};
	for(int i=0;i<arr1.length-1;i++){
		if(arr1[i] != arr1[i+1]-1){
			System.out.println("This number is missing = "+(arr1[i]+1));
		}}
	
																		/////	SORTING AN ARRAY IN JAVA	/////
																		
																		int[] arry={3,67,87,30};
																		Arrays.sort(arry);
																		System.out.println(Arrays.toString(arry));
	
	/////	SUM OF ALL ELEMENTS IN ARRAY	/////
																		
		int [] ann={8,9,0,7,6};
		int sum=0;
		
		for(int i:ann){
		sum+=i;	
		}
		System.out.println(sum);
		
		
																		
																		
																		
}
}