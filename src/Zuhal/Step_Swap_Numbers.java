package Zuhal;

import javax.print.DocFlavor.CHAR_ARRAY;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.omg.CORBA.StringHolder;
import org.omg.PortableServer.ServantActivator;

import Week7_1.ThisKeyWordConcept;
import Week8_Lab.Ford;

public class Step_Swap_Numbers {
	
	public static void main(String[] args){
		
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
	
																		/////	SWAP NUMBERS	/////
																		
																		int a=1;
																		int b=2;
																		int realA=a;
																		int realB=b;
																		
																		System.out.println("a = "+a+"   "+"b = "+b);
																		
																		a=realB;
																		b=realA;
																		System.out.println("a = "+a+"   "+"b = "+b);
																		
																		a=realA;
																		b=realB;
																		System.out.println("a = "+a+"   "+"b = "+b);
	
	/////	SWAP NUMBERS WITHOUT USING THIRD VARIABLE	/////
	
	int swp1=10;
	int swp2=20;
	
	System.out.println("first number is = "+swp1);
	System.out.println("second number is = "+swp2);

	swp2=swp2+swp1;
	swp1=swp2-swp1;
	swp2=swp2-swp1;
	
	System.out.println("first number is = "+swp1);
	System.out.println("second number is = "+swp2);
	
	/////	
	
	}
}