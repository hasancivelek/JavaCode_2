package week_4;

import java.util.Scanner;

public class Lab_4_1 {

	public static void main(String[] args) {
		//Ask user for the array capacity(length)
		//Create an array with that capacity
		//Using a loop, let the user enter elements one by one
		//Print all items in same line using for each loop
		//Print all items in same line using for loop
		//Print all items in same line using while loop
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elemnts your array is going to hold?: ");
		int arraylenght=scanner.nextInt();
		int[]arr=new int[arraylenght];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number " + (i+1));
			arr[i]=scanner.nextInt();
			}
		// for loop
    for (int i = 0; i < arr.length; i++) {
	//System.out.println(arr[i]);
	}
//while loop
    int i=0;
    while(i<arraylenght){
    	//System.out.println(arr[i]);
    	i++;
    }
//for each loop
    for (int j : arr) {
    	//System.out.println(j);
		
	}
	}

}
