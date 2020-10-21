package week_4;

import java.util.Arrays;
import java.util.Scanner;

public class wed_while_2dimensional {

	public static void main(String[] args) {
	
		
		// Two dimensional array : 
		// Having an array as an array element
				
				
				int [][] array1 = {{1,2},{2,2},{3,6},{4,5}};

				// for each loop
				 //for each loops is a special loop for printing lists
				for (int[] outerArray : array1) {
				  for (int innerArray : outerArray) {
						//System.out.print(innerArray + " ");
						//System.out.println(Arrays.deepToString(array1)); for each loop kullanmadan yazdirmak
					}
				//System.out.println();
				}
				
				// nested for loop
				
				for (int i = 0; i < array1.length; i++) {
					for (int j = 0; j < 2; j++) {
						System.out.print(array1[i][j] + " ");
					}
					System.out.println();
				}
				
				// How to print specific elements in two dimensional arrays
				//System.out.println(array1[3][1]);//5
				
				
			//  It is very easy to create infinite loops with while loops, be careful !
				
				// while(boolean condition){}
				
				// Print out Silicone labs 10 times
				
				int i = 1;
				while(i<=10){
					//System.out.println( i+ " : Silicone Labs");
					i++;
				}

				// Print numbers from 10-1 with while loop
				int  j = 5;
			//	System.out.println("j before while loop : " + j);
				while(j>0){
					//System.out.println(j);
					j--;
				}
				
				//System.out.println("j after while loop : " + j);
				
				while(j<5){
					//System.out.println(j);
					j++;
				}
				
				//System.out.println("j after 2nd while loop : " + j);
				
				int [] arr = {-3,-2,-1,0,1,2,3,4,5};
				
				int number = 0;
				while(number < arr.length){
					//System.out.println(arr[number]);
					number ++ ;
				}
				 
				// finding sum of array elements
				int []array = {1,2,3,4,5,6,7,8,9};
				
				int sum = 0;
				
				int s = 0;
				while (s<array.length) {
					sum = sum + array[s];
					s++;
				}
				
				System.out.println(sum);
				
				
				// Do while working very similar to while loops
				/*
				 * Difference with while loop :
				 * Do while loop will always be executed at least one time
				 * even if the condition is false
				 */

				boolean check = false;
				while (check) {
					System.out.println("Hello Silicone Labs");
				//	check = false;
				}
				
				
				do{
					System.out.println("Ahmet Can Turk");
				
				}
				while(check);
				
				
				// stairs
				
				String stairs = "";
				int l = 0; 
				while (l < 6) {
					stairs = stairs + "*";
					System.out.println(stairs);
					l++;
				}
			//	System.out.println(stairs);
				
		//number triangel		
				
				for (int k = 1; k < 7; k++) {// 3 steps
					for (int m = 1; m <= k; m++) {
						System.out.print(m + "");
					}
					System.out.println();
				}

	
	
	
	
	
	
	}
	
	}
	
		
	            

	   

