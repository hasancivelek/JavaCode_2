package Zuhal;



public class Finding_Numbers {
	
	public static void main(String[] args){

		
		
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

		
																	/////   FINDING PRIME NUMBER	/////
																	
																	int a=17869;
																	
																	for(int i=2;i<a/2;i++){
																		if(a%i==0){
																			System.out.println(a+" is not a prime number");
																			break;
																		}	
																	else{
																			System.out.println(a+" is a prime number");
																		}
																			break;
																		}
		
		/////	FINDING FACTORIAL	/////
		
		int b=15;
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
		
		int fib=10;
		
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
	
	/////	FINDING GREATEST NUMBER		/////
	
	int f=9;
	int g=90;
	int h=2;
	
	if((f>g) && (f>h)){
		System.out.println(f+" is the greatest number");
	}
	else if((g>f) && (g>h)){
		System.out.println(g+" is the greatest number");
	}
	else{
		System.out.println(h+" is the greatest number");
	}
	
														/////	GENERATE A MULTLIPLICATION TABLE	/////
														
														int mult=1;
														
														for(int i=1;i<=10;i++){
															for(int j=1;j<=10;j++){
																System.out.println(mult+"*"+j+" = "+mult*j);
															}
															mult++;
															System.out.println();
														}
		/////	AMSTRONG NUMBER		/////
								
			 int nn=370;
			 int realnn=nn;
			 int digit;
			 int top=0;
			 
			 while(nn>0){
				 digit=nn%10;
				 top=top+(digit*digit*digit);
				 nn=nn/10;
			 }
			if (top==realnn){
				System.out.println(realnn+" is an Amstrong number");
			}
			else{
				System.out.println(realnn+" is not an Amstrong number");	
			}
	
	}
}