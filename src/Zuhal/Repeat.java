package Zuhal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.IntBinaryOperator;


import javax.naming.spi.NamingManager;
import javax.print.attribute.standard.NumberUpSupported;

public class Repeat {

	public static void main(String[] args) {
				
									///// 	FINDING PALINDROME NUMBER	/////
		
		int pln=987;	int Rpln;	int Spln=0;	int KeepPln=pln;
		while(pln>0){
			Rpln=pln%10;
			Spln=(Spln*10)+Rpln;
			pln=pln/10;
		}
		System.out.println(Spln);
	
									/////   FINDING PRIME NUMBER	/////
		
		int prm=44; 
		for(int i=2;i<=prm/2;i++){
			if(prm%i==0){
				System.out.println("not prime");
				break;
			}
			else{
				System.out.println("prime");
				break;
			}
		}
																			
									/////	FINDING FACTORIAL	/////
		int fac=4;	int Sfac=1;
		for(int i=fac;i>0;i--){	
		Sfac=Sfac*fac;
		fac--;
		}
		System.out.println(Sfac);															
				
									/////	FACTOR NUMBERS	/////
		int fact=87;
		for(int i=fact;i>0;i--){
		if(fact%i==0){
			System.out.print(i+" ");
		}}			
		System.out.println();
									/////	FIBONACCI NUMBERS	/////
			
		int fif=6;	int fib1=0;	int fib2=1;	int fibS=0;
		for(int i=fif;i>0;i--){
			System.out.print(fib1+" ");
			fibS=fib1+fib2;
			fib1=fib2;
			fib2=fibS;
		}
		System.out.println();
									/////	FIND POWER	/////														
			
		int numP=4;	int pwr=3;	int munS=1;
		for(int i=pwr;i>0;i--){
			munS=munS*numP;
		}
		System.out.println(munS);
								
									/////	FINDING GREATEST NUMBER		/////	
		
		int a=98; int b=8; int c=4;
		if(a>b && a>c){
			System.out.println(a);
		}
		else if(b>a && b>c){
			System.out.println(b);
		}
		else{
			System.out.println(c);
		}
									/////	GENERATE A MULTLIPLICATION TABLE	/////	
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
																												
										/////	AMSTRONG NUMBER		/////
		
		int ams=371; int amsR;  int amsS=0; int amsK=ams;
		while(ams>0){
			amsR=ams%10;
			amsS=amsS+(amsR*amsR*amsR);
			ams=ams/10;
		}
		System.out.println(amsS);
		if (amsS==amsK) {
			System.out.println(amsK+"is an ams number");
		}														
										/////	STEP NUMBERS	/////
			
		for(int i=0;i<5;i++){
			for(int j=i;j<5;j++){
				System.out.print('*');
			}
			System.out.println();
		}
		
										/////	SWAP NUMBERS WITHOUT USING THIRD VARIABLE	/////
		
		int firstnum=10; int secondnum=20; int s=0;
		s=firstnum+secondnum;
		firstnum=s-firstnum;
		secondnum=s-firstnum;
		System.out.println(firstnum+" "+secondnum);
	
										/////   FIND MISSING NUMBER   /////
		int[] arr={2,3,4,4,5,6,7,9};
		for(int i=arr.length-2;i>0;i--){
			if(arr[i] !=arr[i+1]-1){
				System.out.println((arr[i]+1)+"is missing");
			}}
		
										/////	FIND LARGEST AND SMALLEST ELEMENT IN ARRAY	/////
		int small=arr[0];  int large=arr[0];  
		for(int i=0;i<arr.length;i++){
			if(arr[i]>large){
				large=arr[i];
			}
			if(arr[i]<small){
				small=arr[i];
			}}
		System.out.println(small+" "+large);
										/////	FINDING DUPLICATE ELEMENT IN ARRAY	/////
		
		for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j]){
				System.out.println(arr[i]+"dup");
			}}}
	
										/////	SUM OF ALL ELEMENTS IN ARRAY	/////
		int smarr=0;
		for(int i=0;i<arr.length;i++){
		smarr=smarr+arr[i];	
		}
		System.out.println(smarr);
		
										/////   REVERSE STRING	/////
		String name="zuhal";
		for(int i=name.length()-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
		System.out.println();	
										/////// REVERSE INTEGER WITH REVERSING IT TO STRING	/////
		
		int g=987;
		String ssString=String.valueOf(g);
		for(int i=ssString.length()-1;i>=0;i--){
			System.out.print(ssString.charAt(i));
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
										/////	REMOVE JUNK	/////
		
		String weird="8888&^%uuAA;";
		System.out.println(weird.replaceAll("[^a-zA-Z1-9]", ""));
													
										/////	CHECK VOWEL OR CONSTANT	/////
		
		char ca='A';
		if(ca>='a' && ca<='z' || ca>='A'  &&  ca<='Z'){
			if(ca=='a' || ca=='e'  || ca=='i' || ca=='o' ||  ca=='u' 
					||ca=='A' || ca=='E'  || ca=='I' || ca=='O' ||  ca=='U' ){
				System.out.println(ca+" is vowel");
			}
			else{System.out.println("not vowel");
				}
			}
		else{
				System.out.println("not alp");
			}
										/////	CHECK CONTEINS VOWEL or Any Value	/////
		
		String cont="ZuhAl";
		if(cont.toLowerCase().matches(".*[aeiou].*")){
			System.out.println("contains vowels");
		}
																		
										/////	ALPHABET CHECK	/////
					
		if(ca>='a' && ca<='z' && ca>='A'  &&  ca<='Z'){
			System.out.println(ca+" is an alphabet");
		}
										/////	ASCII Value Of CHARACTER	/////
		int asci=ca;
		System.out.println(asci);																	
	 				
										/////	PRINT ALPHABET	/////
		
		for(char ck='a';ck<='z';ck++){
			System.out.print(ck);
		}
		System.out.println();
										/////	LIST OF INTEGERS CONTAINS ODD NUMBER	/////
		
		List<Integer> list=new ArrayList<>();
		list.add(88); list.add(88); list.add(12); list.add(89); list.add(76); list.add(13); list.add(9);
		for(int i=0;i<list.size();i++){
			if(list.get(i)%2 !=0){
				System.out.println(list.get(i)+" is an odd number");
			}
		}
		
											/////	REVERSE LINKED LIST	/////
		LinkedList<Integer> lk=new LinkedList<>();
		lk.add(88); lk.add(88); lk.add(12); lk.add(89); lk.add(76); lk.add(13); lk.add(9);															
			System.out.println(lk);	
			LinkedList<Integer> lkl=new LinkedList<>();
			lk.descendingIterator().forEachRemaining(lkl::add);
			
											/////	HOW TO MERGE 2 LISTS	/////
			List<Integer> my=new ArrayList<>();
			my.add(5);
			List<Integer> my1=new ArrayList<>();
			my1.add(9);
			
			List<Integer> merged=new ArrayList<>(my);
			merged.addAll(my1);
			
			System.out.println(merged);																
		
											/////	ITERATION OF LIST	/////
		
			LinkedList<Integer> lkk=new LinkedList<>();
			lkk.add(88); lkk.add(88); lkk.add(12); lkk.add(89); lkk.add(76); lkk.add(13); lkk.add(9);	
			System.out.println(lkk);
		    Iterator iti=lkk.iterator();
		    while(iti.hasNext()){
		    	System.out.print(iti.next()+" ");  	
		    }
		    System.out.println();
		
		    
		    						///// LINK LISTI  YAZMA ///
		    
		    LinkedList<String> str=new LinkedList<>();
			str.add("s"); str.add("t"); str.add("r"); str.add("i"); str.add("n"); str.add("g");
			System.out.println(str);
			
									//// LINK LISTI TERSEN YAZMA STRING ///
			
			LinkedList<String> strR=new LinkedList<>();
			str.descendingIterator().forEachRemaining(strR::add);
			System.out.println(strR);
			  
			
									///// 	ARRAY TERSTEN YAZDIR	/////
			
			Integer[] intArray = {10,20,30,40,50,60,70,80,90};
		     
			  //print array starting from first element
			    System.out.println("Original Array:");
			    for(int i=0;i<intArray.length;i++)
			         System.out.print(intArray[i] + "  ");
			     
			    System.out.println();
			     
			    //print array starting from last element
			    System.out.println("Original Array printed in reverse order:");
			         for(int i=intArray.length-1;i>=0;i--)
			         System.out.print(intArray[i] + "  ");
			    
			String[] rings={"z","k","l"};
				
				for(int i=rings.length-1;i>=0;i--)
		         System.out.print(rings[i] + "  ");
			 
			
	

	    
}
}
