package week_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recap_4 {

	public static void main(String[] args) {
		// for loop
		//int num=6;
		for(int num=6; num<10; num++){//num+=5
			//System.out.println(num);
			
			
		}
		
		//alphabet upper case we are staring characters inside of a string variable
		String upperCase="";// 'A', 'Z'
		for(char character ='A'; character<='Z'; character++){
			upperCase=upperCase + character;
			//System.out.println(character);
		}
		
		//System.out.println(upperCase);
	
		
		
		//lower case alphabet we are printing characters
		
		for(char character ='a'; character<='z'; character++){
		
			//System.out.print(character);
		
		}
		
		// two dimensional arrays
		//Arrays inside of an array 
		
		
		//inner index           0   1   2     0   1   2     0    1    0   1   2
		char[][] character2D={{'X','Y','Z'},{'A','B','C'},{'D','F'},{'A','C','T'}};
		//                     -----------     ---------    -------   ----------
		//index outer              0               1           2          3
		
		//System.out.println(character2D[2][0]);//D
		// metod Array.deepToString(array[][]) tum array yazdirmak icin
		
	//System.out.println(Arrays.deepToString(character2D));
		
		
		// for each loop
		for (char[] cs : character2D) {
			//System.out.println(cs);
			for (char c : cs) {
			//System.out.println("'"+c+"'");
				//System.out.println((int)c);// ASCI DEGERLERINI ALMAK ICIN
			
			}
		}
			 int array[]={1,2,3,4,5};
			 for (int elements : array) {
				// System.out.println(elements);
				
			}
			 //array is holding elements in data type of int arrays
			 //elements of this array is holding element in data type of int 
			 int [][] arrays={{1,1,2,3},{2,3,4},{3,5,6},{4,7,8},{5,9}};
			 for (int[] elementInOuterArray : arrays) {
				// System.out.println(elementInOuterArray);
				 for (int innerArrayElements : elementInOuterArray) {
					System.out.print(innerArrayElements);
				}
				
			 }
			 
			 
			 
			 
			 
			}
		}
	

			 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


