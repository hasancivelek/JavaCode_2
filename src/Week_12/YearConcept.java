package Week_12;


import java.time.Year;

public class YearConcept {

	public static void main(String[] args) {
		
		Year year = Year.now();
		System.out.println(year);
		System.out.println(year.isLeap());

		Year year1 = Year.of(2010);
		System.out.println(year1);
		
		
		// Year
				Year year3 = Year.of(2010);
				System.out.println(year3);
				System.out.println(year3.isLeap());
				
				Year year2 = Year.now();
				
				boolean check = year2.isAfter(year);
				System.out.println(check);
		
	}

}