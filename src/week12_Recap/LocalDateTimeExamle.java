 package week12_Recap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExamle {

	public static void main(String[] args) {
		
LocalDateTime time = LocalDateTime.now();
		
		LocalDate date = LocalDate.of(2020, 9, 23);
		
		DateTimeFormatter dTimeFormatter = DateTimeFormatter.ofPattern("hh : mm : s : a");
		System.out.println(time.format(dTimeFormatter));
		
		// Sep 23
		dTimeFormatter = DateTimeFormatter.ofPattern("MMM dd");
		System.out.println(date.format(dTimeFormatter));
		

	
	}

}
