package week5;

public class Lab_5 {

	
static String reverseString(String s1){
	String reverse="";
	for(int i=s1.length()-1; i>-1 ; i--){
		reverse+=s1.charAt(i);
		System.out.print(s1.charAt(i));
	}
	
	
	
	return reverse;
}
 static void myString (String name){
	for (int i = 0; i < name.length(); i++) {
		
		
	}
	System.out.println(name);
}
 //for (int i = 0; i < names.length; i++) { 
	//for (int j = i + 1; j < names.length; j++) { 
		//if (names[i].equals(names[j]) ) {
			// got the duplicate element 
			//System.out.println(names[j]);


static void dupString(String[] string){
	for (int i = 0; i < string.length; i++) {
		for (int j = i+1; j < string.length; j++) {
			if (string[i].equals(string[j])) {
				
				System.out.println(string[j]);
				
			}
		
		}
		
	}
	
}
static void findSum(int n){
	int result=0;
	while(n>0){
		result+=n%10;
		n/=10;
//System.out.println(n);
	}
		
	System.out.println(result);
	
	
}
//54
  static String thirdsLetter (String s){
  String thirds="";
  for(int i=0;i<s.length();i+=3){
  thirds =thirds+ s.charAt(i);
  }
return thirds;
 }
//55
 
 public static String censorLetter(String s,char a)
	{
	String z= s.replace(a,'*');
	 return z;
	}
 //56
 public static String surround(String s, char search_term)
	{
	 String newCh=Character.toString(search_term);
	  String newS=s.replace(newCh,"("+newCh+")");
	
	
		return newS;
	}
 //57
 public static String surroundStr(String s,String search_term)
	{
		//String newS=s.replaceAll(search_term,"("+search_term+")");
	String newS=s.replaceAll(search_term,"("+search_term+")");	
	 return newS;
	}
 //58
 //public static void main(String[] args)
 { 
	 String output;
   String text = "hello";
   if (text.indexOf(" ") == -1) //if a space doesn't exist
   {
   	 output = "one word";
   }
   else
   {
   	 output = "more than one word";
   }
   System.out.println(output);
 }
	public static void main(String[] args) {
	//System.out.println(thirdLetter("technology")); //"thly"
		System.out.println(surround("abcabcabc",'c'));
		StringBuffer myBufeer= new StringBuffer("merhaba yeni gun");
		//System.out.println(myBufeer.reverse());
		System.out.println(myBufeer.append(" San Antonio"));
		
		String aString="pantolan";
		String arr [] = aString.split("a");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
        String number = "20";
		
		int newNumber = Integer.parseInt(number);
		
		System.out.println(newNumber + 8);
  
		
		
		Lab_5 obj= new Lab_5();
		String ab="i love java";
		myString(ab);
		
		
		
		//reverseString("hasan");
		
		//System.out.println(reverseString("hasan"));
String [] myString ={"hasan","zuhal","ihsan","hasan"};
dupString(myString);
findSum(456);

	}	
}
