package week_13_Interview_Question;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ASCIIValueOfCharacters {

	public static void main(String[] args) {
		
		//create a program that can find the ascii value of the characters

//		char c='k';
//		int k=c;
//		System.out.println(k);
		
		char character='$';
		System.out.println((int)character);
		
		int ascii=character;
		System.out.println(ascii);
		
		
		//find the greatest number out of 3 numbers
		
		int x=9, y=3, z=6;
		
		if(x>y&&x>z){
			System.out.println(x);
		}
		else if(y>x&&y>z){
			System.out.println(y);
		}
		else{
			System.out.println(z);
		}
		
		//Generate a multiplication table
		
		int tableNumber=9;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(tableNumber+"X"+i+"="+tableNumber*i);
		}
		
		//print alphabet (a-z) with using loop
		
		for (char c ='a'; c<='z'; c++) {
			System.out.println(c +" ");
		}
		
		//find the number of digits of the variables
		
		int number =40009; //4digits
		
		int digits=0;
		while(number>0){
			number/=10;
			digits++;
		}
		System.out.println(digits);
		
		//Largest number in array using Collection sort method
		
		Integer[] arr={11,2,3,4};
		
		List<Integer>list=Arrays.asList(arr);
		
		Collections.sort(list);
		
		System.out.println(list.get(list.size()-1));
		
	
	}
}
