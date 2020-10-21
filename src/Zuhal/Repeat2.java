package Zuhal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.IntBinaryOperator;


import javax.naming.spi.NamingManager;
import javax.print.attribute.standard.NumberUpSupported;

public class Repeat2 {

	public static void main(String[] args) {
				
									///// 	FINDING PALINDROME NUMBER	/////
	int pal=121;	int Rpal; 	int Spal=0;	int Kpal=pal;
	while(pal>0){
		Rpal=pal%10;
		Spal=(Spal*10)+Rpal;
		pal=pal/10;
	}
	if(Spal==Kpal){
		System.out.println(Kpal+" is a palindrome number");
	}
	else{
		System.out.println(Kpal+" is not a palindrome number ");
	}
									/////   FINDING PRIME NUMBER	/////
	int prm=127;	int Rprm; 	int Sprm=0;		
		
	for(int i=2;i<=prm/2;i++){
		Rprm=prm%i;
		if(Rprm!=0){
			System.out.println(prm+" is a prime number");
			break;
		}
		else{
			System.out.println(prm+" is not a prm number ");
			break;
		}	
	}
																			
									/////	FINDING FACTORIAL	/////
	int fct=5;	int Rfct; 	int Sfct=fct;	
	for(int i=1;i<fct;i++){
		Sfct=Sfct*(fct-1);
		fct--;
	}
	System.out.println("Factorial of number is "+Sfct);
				
									/////	FACTOR NUMBERS	/////
	int fctr=5;	int Rfctr; 	int Sfctr=fctr;	
	for(int i=1;i<=fctr;i++){
		Rfctr=fctr%i;
		if(Rfctr==0){
			System.out.print(i+" ");
		}	
	}
	System.out.println();
											
									/////	FIBONACCI NUMBERS	/////
	
	int fib=11;	int Ffib=0; int Sfib=1;	int SumFib=0;	int Kfib=fctr;
	for(int i=1;i<=fib;i++){
		System.out.print(Ffib+" ");
		SumFib=Ffib+Sfib;
		Ffib=Sfib;
		Sfib=SumFib;	
	}
	System.out.println();		
									/////	FIND POWER	/////														
	int Npwr=5;	int pwr=4;	int Rpwr; 	int Spwr=1;
	for(int i=1;i<=pwr;i++){
		Spwr=Spwr*Npwr;
	}
	System.out.println(Spwr);	
								
									/////	FINDING GREATEST NUMBER		/////	
	int a=3; 	int b=9;	int c=23; 
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
	/*for(int i=1;i<=10;i++){
		for(int j=1;j<=10;j++){
			System.out.println(i+"*"+j+"= "+(i*j));
		}
	}*/
																												
									/////	AMSTRONG NUMBER		/////
	int ams=153;	int Rams;	int Sams=0;	int Kams=ams;
	while(ams>0){
		Rams=ams%10;
		Sams=Sams+(Rams*Rams*Rams);
		ams=ams/10;
	}
	if(Sams==Kams){
		System.out.println("Amstrong");
	}
	else{
		System.out.println("Not Amstrong");
	}
									/////	STEP NUMBERS	/////
	for(int i=1;i<=5;i++){
		for(int j=i;j>0;j--){
			System.out.print(" *");
		}
		System.out.println();
	}
	for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print(" *");
		}	
		System.out.println();
	}								/////	SWAP NUMBERS WITHOUT USING THIRD VARIABLE	/////
		
	int ab=10;	int ac=20;
	ac=ab+ac;
	ab=ac-ab;
	ac=ac-ab;
	System.out.println(ab+ " "+ac);
	
									/////   FIND MISSING NUMBER   /////
	int[] arr={1,2,3,5,6,6,7};
	for(int i=0;i<arr.length-1;i++){
		if(arr[i] !=arr[i+1]-1){
			System.out.println(arr[i]+1);
		}
	}
		
									/////	FIND LARGEST AND SMALLEST ELEMENT IN ARRAY	/////
	int large=arr[0];	int small=arr[0];
	for(int i=0;i<arr.length;i++){
		if(arr[i]>large){
			large=arr[i];
		}
	}
	System.out.println("max = "+large);	
									/////	FINDING DUPLICATE ELEMENT IN ARRAY	/////
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j]){
				System.out.println(arr[i]);
				break;
			}
		}
		
	}		
	
									/////	SUM OF ALL ELEMENTS IN ARRAY	/////
	int arrSum=0;
	for(int i=0;i<arr.length;i++){
		arrSum=arrSum+arr[i];
	}
	System.out.println(arrSum);	
									/////   REVERSE STRING	/////
	String name="zuhal";
	for(int i=name.length()-1;i>=0;i--){
		System.out.print(name.charAt(i));
	}
	System.out.println();
									/////// REVERSE INTEGER WITH REVERSING IT TO STRING	/////
		int rvrName=9801;
		String name1=String.valueOf(rvrName);
		for(int i=name1.length()-1;i>=0;i--){
			System.out.print(name1.charAt(i));
		}
		System.out.println();
									/////   REVERSE INTEGER   /////
	int x=678;	int Rx;	int Sx=0;
	while(x>0){
		Rx=x%10;
		Sx=(Sx*10)+Rx;
		x=x/10;	
	}
	System.out.println(Sx);
	
									/////	REMOVE JUNK	/////
		String junk="hjTR67%$3";
		System.out.println(junk.replaceAll("[^a-zA-z1-9]", ""));
														
									/////	CHECK VOWEL OR CONSTANT	/////
		char cc='A';
		if(cc>='a' && cc<='z' || cc>='A'  &&  cc<='Z'){
			if(cc=='a' || cc=='e'  || cc=='i' || cc=='o' ||  cc=='u' 
					||cc=='A' || cc=='E'  || cc=='I' || cc=='O' ||  cc=='U' ){
				System.out.println(cc+" is vowel");
			}
			else{System.out.println("not vowel");
				}
			}
		else{
				System.out.println("not alp");
			}
	
									/////	CHECK CONTEINS VOWEL or Any Value	/////
		String hhh="ij";
	System.out.println(hhh.toLowerCase().matches(".*[aeiou].*"));
																		
									/////	ALPHABET CHECK	/////
	char ca='K';
	if(ca>='a' && ca<='z' && ca>='A'  &&  ca<='Z'){
		System.out.println(ca+" is an alphabet");
	}			
		
									/////	ASCII Value Of CHARACTER	/////
	int ascii=ca;
	System.out.println(ascii);
				
									/////	PRINT ALPHABET	/////
	for(char i='a';i<='z';i++)	{
		System.out.print(i+ "");
	}
	System.out.println();
	
									/////	LIST OF INTEGERS CONTAINS ODD NUMBER	/////
	List<Integer> list=new ArrayList<>();
	list.add(5);	list.add(34);	list.add(7);
	for(int i=0;i<list.size();i++){
		if(list.get(i)%2 !=0){
			System.out.print(list.get(i)+ " ");
		}
	}
	System.out.println();
	
		
									/////	REVERSE LINKED LIST	/////
	List<String> names=new LinkedList<>();
	names.add("z");	names.add("u");	names.add("h");
	for(int i=names.size()-1;i>=0;i--){
		System.out.print(names.get(i));
	}
	System.out.println();		
									/////	HOW TO MERGE 2 LISTS	/////
	List<Integer> list1=new ArrayList<>();
	list.add(55);	list.add(4);	list.add(79);	
	
	List<Integer> merged=new ArrayList<>(list);
	merged.addAll(list1);
	System.out.println(merged);
	System.out.println();	
									/////	ITERATION OF LIST	/////
	Iterator it=merged.iterator();
	while(it.hasNext()){
		System.out.print(it.next()+" ");
	}
		
		    
		    						///// LINK LISTI TERSEN YAZMA ///
		    
	   
    LinkedList<String> str=new LinkedList<>();
	str.add("s"); str.add("t"); str.add("r"); str.add("i"); str.add("n"); str.add("g");
	System.out.println(str);  
			
									//// LINK LISTI TERSEN YAZMA STRING ///
			
		LinkedList<String> nw=new LinkedList<>();	
		str.descendingIterator().forEachRemaining(nw::add);
		System.out.println(nw);
			
								  /////   ARRAY TERSTEN YAZDIR	/////
	int[] ar={3,5,7,9};
	for(int i=0;i<ar.length;i++){
		System.out.print(ar[i]);
	}
	System.out.println();	
	for(int i=ar.length-1;i>=0;i--){
		System.out.print(ar[i]);
		

	}
			 
	String[] rings={"z","k","l"};
	
	for(int i=rings.length-1;i>=0;i--)
     System.out.print(rings[i] + "  ");		
	

	    
}
}
