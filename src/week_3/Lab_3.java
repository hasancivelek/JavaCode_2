package week_3;

import java.util.Arrays;

public class Lab_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner myInput =new Scanner(System.in);
		System.out.println("Enter the First Word");
		String word = myInput.next();
		System.out.println("Enter the Second Word");
		String word1= myInput.next();
		
		if (word.equals(word1)) {
			System.out.println("word equals word1");
			
		}
		else {
			System.out.println("word does not equals world1");
		}

		Scanner input =new Scanner(System.in);
		System.out.println("Enter the Age");
		int age= input.nextInt();
		
		if (age<2) {
			System.out.println("Ineligible");
		}
		else if (age==2) {
			System.out.println("Toddler");
			
		}
		else if (age<=5) {
			System.out.println("Early Childhood");
			
		}
		else if (age<=7) {
			System.out.println("Young Reader");
			
		}
		else if (age<=10) {
			System.out.println("Elementary");
			
		}
		else if (age<=12) {
			System.out.println("Middle");
			
		}
		else if (age==13) {
			System.out.println("Imposible");
			
		}
		else if (age<=16) {
			System.out.println("High School");
			
		}
		else if (age<=18) {
			System.out.println("Scholar");
			
		}
		else {
			System.out.println("Ineligible");
		}
	
		String myString =new String("Fairwood Seattle");
		System.out.println(myString.contains("d"));
		

Scanner scan = new Scanner(System.in);
System.out.println("Enter the Word");
String word1 = scan.next();
System.out.println("Enter the Word Again");
String word2 = scan.next();
if (word1.length()>word2.length()) {
	System.out.println("Word1 Greater than Word2");
	
}
else if (word2.length()>word1.length()) {
	System.out.println("Word2 Greater than Word1");;
	
	
}
else{
	System.out.println("Word1= Word2");
	
}


		

		
		
	     //q-5

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Word");
	String word1 = scan.next();
	System.out.println("Enter the Word Again");
	String word2 = scan.next();
	System.out.println(word1.contains("h"));
	System.out.println(word2.contains("o"));
	*/
	
/*	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Word");
	String word1 = scan.next();
	//int start=scan.nextInt();
	//int end= scan.nextInt();
	int start=word1.length();
	//char firstLetter=word1.charAt(0);
	//char lastLetter=word1.charAt(start-1);
	System.out.println(""+word1.charAt(0)+word1.charAt(start-1));
*/
  /*   
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word1 = scan.next();
		System.out.println("Enter the Word Again");
		String word2 = scan.next();
		System.out.println(word1+word2+word2+word1);
  */
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.next();	
		int a=word.length();
		int middle=a/2;
		if(a>=5){
			if(a%2!=0){
				System.out.println(word.substring(middle-1, middle+2));
			}
			else{
				System.out.println("Invalid");
			}
				}
		else{
				System.out.println("Invalid");
			}
		*/
	
/*
Scanner scan = new Scanner(System.in);
    //DO NOT CHANGE
    int num, digit1, digit2, digit3, digit4, digit5;
    System.out.println("Enter your number:");
    num = scan.nextInt();

    digit5=num%10;
    digit4=(num/10)%10;
    digit3=(num/100)%10;
    digit2=(num/1000)%10;
    digit1=(num/10000)%10;
    

    System.out.println(digit1);
    System.out.println(digit2);
    System.out.println(digit3);
    System.out.println(digit4);
    System.out.println(digit5);

int[] number={digit1,digit2,digit3,digit4,digit5};

System.out.println(Arrays.toString(number))	;
	
for (int element: number) {
    System.out.println(element);
}
	
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	   
	    int lenght=email.length();
    	int num=email.indexOf("_");
    	int at=email.indexOf("@");
    	
    	String first=email.substring(0,num);
    	String last=email.substring(num+1,at);
    	String extension=email.substring(at,lenght );
	    
	    
	    if (email.contains("_")){
	    	
	    	
	    	
	    	System.out.println(last+"_"+first+extension);
	    }
	    else{
	    	System.out.println(email);
	    }
	*/
		
		
	 
	String[] myArray= new String [5];
	
	myArray[0]="hasan";
	myArray[1]="zuhal";
	myArray[2]="nihal";
	myArray[3]="ihsan";
	myArray[4]="meral";
	
	//for(int i=0; i<myArray.length; i++){
	System.out.print( Arrays.toString(myArray));
		
	
	}
	
	

	
	
	
	}
	
	
	
		
		
	//}  
        
    
	
             
    
	
		
	

	














