package Zuhal;

import javax.imageio.ImageTypeSpecifier;
import javax.print.DocFlavor.STRING;

import org.omg.CORBA.PUBLIC_MEMBER;

public class String_Reverse_VovelsConsant {

	public static void main(String[] args) {
		
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
				
													
																/////	REMOVE JUNK	/////
															
															String rmv="1278&*6kilhM";
															System.out.println(rmv);
															rmv=rmv.replaceAll("[^1-9]", "");
															System.out.println(rmv);
															
															String rmv1="1278&*6kilhM";
															rmv1=rmv1.replaceAll("[^a-zA-Z]", "");
															System.out.println(rmv1);
															
															String rmv2="1278&*6kilhM";
															rmv2=rmv2.replaceAll("[^a-zA-Z1-9]", "");
															System.out.println(rmv2);
													
				/////	CHECK VOWEL OR CONSTANT	/////
						
				char character='i';
				
				if(character=='a' || character=='e' || character=='i'  ||  character=='o' || character=='u' ){
					System.out.println(character+" is a vowel");
				}
				else{
					System.out.println(character+" is not a vowel");
				}
				
				switch(character){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println(character+" is a vowel");
					break;
				default:
					System.out.println(character+" is not a vowel");
				
				}
				
																/////	CHECK CONTEINS VOWEL or Any Value	/////
				
																String sst="zAz";
																if(sst.toLowerCase().matches(".*[aeiou].*")){
																		System.out.println(true);
																}
																else{
																	System.out.println(false);
																}
																
				/////	ALPHABET CHECK	/////
				
				char a='u';
				
				if((a>='a' && a<='z') || (a>='A' && a<='Z' )){
					System.out.println(a+" is a character");
				}
				else{
					System.out.println(a+" is not a character");
				}
				
																			/////	ASCII Value Of CHARACTER	/////
																			
																			char firstchar='+';
																			int firstint=firstchar;
																			System.out.println(firstint);
 				
				/////	PRINT ALPHABET	/////
				
				for(char c='a';c<='z';c++){
					System.out.print(c+" ");
				}
				System.out.println();
				
				///SWAPPING STRING WITHOUT USING THIRD VARIABLE	///
				
				String ab = "Love";  
		        String b = "You";  
		        System.out.println("Before swap: " + ab + " " + b);  
		        ab = ab + b;  
		        b = ab.substring(0, ab.length() - b.length());  
		        ab = ab.substring(b.length());  
		        System.out.println("After : " + ab + " " + b);  	
				

		}
	



}