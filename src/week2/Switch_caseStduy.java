package week2;

import java.util.Scanner;

public class Switch_caseStduy {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int numericGrade =input.nextInt();
		String letterGrade=" ";
		
		switch(numericGrade){
		case 5:
			 letterGrade="A";
			break;
		case 4:
			letterGrade="B";
			break;
		case 3:
			letterGrade="C";
			break;
		case 2:
			letterGrade="D";
			break;
			default:
			System.out.println("wrong number");
				break;
			}
		System.out.println(letterGrade);		

	}

}
