package week_13_Interview_Question;

import javax.print.DocFlavor.CHAR_ARRAY;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.omg.CORBA.StringHolder;
import org.omg.PortableServer.ServantActivator;

import Week7_1.ThisKeyWordConcept;
import Week8_Lab.Ford;

public class deneme {
	
	public static void main(String[] args){

		/////   REVERSE STRING	/////
		
		String name="Zuhal";
		for(int i=name.length()-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
		System.out.println();
		
		/////// REVERSE INTEGER WITH REVERSING IT TO STRING	/////
		
		int number=1278;
		String rvrse=String.valueOf(number);
		for(int i=rvrse.length()-1;i>=0;i--){
			System.out.print(rvrse.charAt(i));
		}
		System.out.println();
		
		/////  REVERSE INTEGER   /////
		
			int nmbr1=87432;
			int remain1;
			int result1=0;
			while(nmbr1>0){
			
				remain1=nmbr1%10;
				result1=(result1*10)+remain1;
				nmbr1=nmbr1/10;
			}
			System.out.println(result1);
		
		///// FINDING PALINDROME NUMBER	/////
		
		int num=678;
		int remain;
		int result=0;
		int t=num;
		
		while(num>0){
			remain=num%10;
			result=(result*10)+remain;
			num=num/10;
		}
		System.out.println("t="+t);
		System.out.println("result="+result);
		if(t==result){
			System.out.println("This number is palindrom number");
		}
		else{
			System.out.println("This number is not palindrome");
		}
			
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
		
		/////   FINDING PRIME NUMBER	/////
		
		int a=17869;
		
		for(int i=2;i<a/2;i++){
			if(a%i==0){
				System.out.println(a+" is not a prime number");
			}	
		else{
				System.out.println(a+" is a prime number");
			}
				break;
			}
		
		/////	FINDING FACTORIAL	/////
		
		int b=5;
		int fac=1;
		
		for(int i=1;i<=b;i++){
			fac=fac*i;
		}
		System.out.println(fac);
		
		/////	FACTOR NUMBERS	/////
		
		int c=13;
		
		for(int i=1;i<=c;i++){
			if(c%i==0){
				System.out.println(i+" is a factor number for "+c);
			}}
		
		/////	FIBONACCI NUMBERS	/////
		
		int fib=6;
		
		int ind1=0;
		int ind2=1;
		int sum;
		
		for(int i=1;i<=fib;i++){
			System.out.print(ind1+" ");
			sum=ind1+ind2;
			ind1=ind2;
			ind2=sum;
		}
	System.out.println(" ");
	
		/////	FIND POWER	/////
		
		int base=4;
		int power=4;
		int pwrNmbr=1;
		
		for(int i=1;i<=power;i++){
			pwrNmbr=pwrNmbr*base;
		}
	System.out.println("Power of base number is "+pwrNmbr);
		
	/////	STEP NUMBERS	/////
	
	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+" ");
			}
		System.out.println();
		}
	
	for(int i=5;i>=1;i--){
		for(int j=5;j>=i;j--){
			System.out.print(j+" ");
			}
		System.out.println();
		}
	
	for(int i=1;i<=5;i++){
		for(int j=5;j>=i;j--){
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print(j+" ");
		}
		System.out.println();
	}
	

	}
}