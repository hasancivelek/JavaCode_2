package week_3;

import java.util.Arrays;

public class Recap_3 {
	
	public static void main(String[] args) {
		
		
		
		//Data[]variablename={el1,el2,el3,....}
		String[] grades={"A","B","C","D","F"};
		//                0   1   2   3   4 index
		//retrive elements: variablename[index]
		System.out.println(grades[0]);  //A
		String hasansGrade=grades[0];//Storing array elements in string
		System.out.println(hasansGrade);//A
		
		int[]numbers={4298,4299};
		numbers[0]=numbers[1];// numbers[0]=4299
		numbers[1]=numbers[0];//numbers[1]=4299
		System.out.println(numbers[1]);
		System.out.println(numbers[0]);
		//For Each loop to print elements in grades array
		
		for (String i : grades) {
			System.out.print(i + " ");
			
		}
		
		String string3 = "Zuhal";
		System.out.println(string3.endsWith("l")); //true
		System.out.println(string3.endsWith("m")); //false
		System.out.println(string3.toUpperCase().endsWith("L"));
		
		String str =new String("hasan");
		System.out.println(str);
		str+="civelek";
		System.out.println(str);
		
		
		int[]myArray={3,5,7,};
		int my=4;
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		
		System.out.println(Arrays.binarySearch(myArray, my));
		
		//string manipulation string duzenleme
		String str4="I love Java";
		String str5=  "             I love Java            "              ;
		//Trim method is trimming extra space from begin and from end of the string
		System.out.println(str5);
		System.out.println(str5.trim());
	 String str6 ="Your total amount is 1500 USD";
	 System.out.println(str6.substring(21,26));
	 System.out.println(str6.substring(21,str6.indexOf("USD")-1));
	 System.out.println(str6.indexOf("U")-1);
	 
	 //Slit()
	 String language ="Java-Python-C++-C";
	 String []myArray2=language.split("C");
	 System.out.println(Arrays.toString(myArray2));
	// System.out.println(language.split("-"));
	 
	 //endsWith
	 System.out.println(str4.endsWith("v"));
			 
			 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}