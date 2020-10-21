package week_4;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.PortableServer.POAPackage.AdapterAlreadyExists;

public class Forloop_Monday {

	public static void main(String[] args) {

		//there are 3 loops in java
		//for loops, while loops, do while loops
		//for loops
		//loops: making something repetitively
		
		// how to do the statement below 1000
	//	System.out.println("welcome");
		//Create an integer ,an increase it by one until it reaches 3
		//In every step you are increasing , print stetament
		// i=0:step1
				//i=1:step2
				//i=2:step3
		
		for(int i=0; i<3; i++){
			//System.out.println("welcome");
			//System.out.println(i);
			//System.out.println(i+ ":hello");
		}
		//printing array elements
		
		int[] array={5,4,3,2,1};
		//System.out.println(array[0]);//  5
		//System.out.println(Arrays.toString(array));
	
		for (int i = 0; i < array.length; i++) {
			
			//System.out.print(array[i]+" ");
			
			//System.out.println(array[i]+30);
		}
		//we can create a for loop which is printing number from 10-1
		//Create an integer, and decrease it by one until it reaches 0
		//In every step you are decreasing,print statement
		// i=0:step1
		//i=1:step2
		//i=2:step3
		for(int i=3 ; i>0; i--){
			//System.out.println(i);
			
		}
		
		//i++={i=i+1}
		//i=0:step1
		//i=1:step2
		//i=2:step3
		//i=3:step4
		for(int i=0; i<20; i=i+5){ //i=i*5 ,i=i*10 ,....i=i+13
			//System.out.println(i);
			
		}

		//mul table  of 5
		for (int i = 0; i < 10; i++) {
			//System.out.println(5+"x"+i+"=" +(5*i));
			
		}
		
		//finding the even numbers in array
	
		int[] array1 ={1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<array1.length ; i++){
			
		
		
		if(array1[i] %2==0){
			//System.out.println(array1[i]+ ":  even");
			
		}
		else{
			//System.out.println(array1[i]+ ":  odd");
		}
		
	}
		
		//break statement we are using break statements to kill (terminate) the loops
		//and switch case blocks
		//I will create a program which counts from 0-10
		//but it will stop as soon as it reaches 5
		
		for (int i = 0; i < 10; i++) {
		
			//System.out.println(i);
			
			if(i==5){
				break;
				
			}
			
			
		}
		
		//continue satatement
		// we are using continue statement in order to skip statement
		//print all the number except 5
		// 1 way
		for (int i = 0; i < 10; i++) {
			if(!(i==5)){
				//System.out.println(i);
				
			}
			
		}
		// 2nd way is continue statement;
		//how to skip even numbers with continue statement (i%2==0) even numbers
		for (int i = 0; i < 10; i++){
			if(i%2==0){//i==5 is skip the 5
				continue;
				
			}
			
			//System.out.println(i);
		}
		
		
		// nested for loops
		
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4;j++) {
				//System.out.println(i);
				System.out.println(j);
				
				
			}
			
		}
		
		//create a multip. table with nested for loop
		for(int i =1; i<11; i++){
			for(int j= 1; j<11; j++){
				//System.out.print(i*j + " ");
			}
			//System.out.println();	
		}
		
			
		
	}	
}	
	     
	      
	    
	
	
	
	
	
	
	
	
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


