package Week_12;

import java.time.LocalDate;

import java.time.LocalDate;


public class DateConcept1 {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);	
		
		System.out.println(today.plusDays(1));
		
		System.out.println(today.plusDays(-1));
		
		System.out.println(today.minusDays(1));
		
		//date one week later
		
		System.out.println(today.plusWeeks(1));
		
		// lenght of this year
		
		System.out.println(today.lengthOfYear());
		
		System.out.printf("%s days in %s\n" ,today.lengthOfYear(),today.getYear());
		
		
	//	int a = DateConcept1.method();
		
	}
	
	//static int method(){
	//	return 9;
	}
//}
