package week5;

import java.util.Scanner;

public class Lab_5_1 {
/*question 1
 * This java method is printing only the first element of the array. 
 * Change this method to a Java program that loops through the array below
 *  and prints all the elements inside of the array. 
 */
public static void arrayPrinter(int []arrayParameter) {
		for (int i = 0; i < arrayParameter.length; i++) {
			System.out.print(arrayParameter[i]);
		}
		//System.out.println(arrayParameter[0]);
		}

	//question 2
	public static  void areaOfRect(int width, int lenght){
		System.out.println("Area of rectagle "+(width*lenght));
		}
	//////////////////////////////////////
	//question 3
	public static void calculates (int num){
		
		int result = 0;
		
		while(num > 0) {
			result += num % 10;
			num /= 10;
		}
	System.out.println(result);
	}
	//question 3/////////////////////////////////////
public static int cal1(int num){
	
	int result = 0;
	
	while(num > 0) {
		result += num % 10;
		num /= 10;
	}
	
	return result;
}
//////////////////////////////////////////
///question 4
public static void myString(String s1){
	for (int i = s1.length()-1; i >-1; i--) {
		System.out.print(s1.charAt(i));
	}
	System.out.println();
}


static String reverseTheString(String string) {
	String reversed = "";
	for (int i = string.length() - 1; i > -1; i--) {
		reversed += string.charAt(i);
	}
	return reversed;
}





//////////////////////question 5
public static void findDuplicate (int[] numbers){
System.out.println("Finding duplicate elements in array using brute force method"); 
			for (int i = 0; i < numbers.length; i++) { 
				for (int j = i + 1; j < numbers.length; j++) { 
					if (numbers[i]==numbers[j])  {
						// got the duplicate element 
						System.out.println(numbers[j]);
				}
			}
		}
}
//Q6
//Write a method named isEven that accepts an int argument. 
//The method should return true if the argument is even, or false otherwise. 
	public static boolean isEven(int num){
		if (num % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}

//////qQ7
	static String cProfit(int buyPrice, int sellPrice) {

		if (buyPrice > sellPrice) {
			return "loss";
		} else if (buyPrice < sellPrice) {
			return "profit";
		}
		else {
			return "no loss";
		}

	}

//////extra
public static void personalInformation(Scanner input){
	System.out.println("What is your name : ?");
	String name=input.nextLine();
	System.out.println("What is your lastname : ?");
	String lastname=input.nextLine();
	System.out.println("What is your age : ?");
	int age=input.nextInt();
	System.out.println(name+lastname+age);
	
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		areaOfRect(5, 10);
///////////////////////////////
		
	    calculates(235);	
	////////////////////////////////////	
		System.out.println(cal1(235));
		//////////////////////
	myString("Silicone Labs");
	System.out.println(reverseTheString("hasan civelek"));
	///////////////////////////////////
int [] myArray={3,7,8,45,3,7,9};
	findDuplicate(myArray);
	////////////////////////
	int [] arrayArgument = {9,8,7,6,5,4,3};
	arrayPrinter(arrayArgument);
	System.out.println();
	///////////////////////////

if(isEven(95))
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }    
//////extra
Scanner input = new Scanner(System.in);
personalInformation(input);
/////////////////
System.out.println(cProfit(100, 90));
System.out.println(cProfit(90, 100));
System.out.println(cProfit(100, 100));
	}
	

}
