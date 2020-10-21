package week11_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Stream_1 {
	
	public static void main(String[] args) {
		
	List<Integer> number = new ArrayList<Integer>(Arrays.asList(2,3,4,5));
	
	// Create a square list, and store squares of these number list
	
//        list   target stream   changing   converts stream to list       
	List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
	
	System.out.println(square);
	
	
	// mapToInt()
	
	int sum = number.stream().mapToInt(x -> x*x*x).sum();
	System.out.println(sum);
	
	// Create a list of String
	
	List <String> stringList = new ArrayList<>(Arrays.asList("Java", "Selenium", "Cucumber","C++"));
	
	// filter
	
	System.out.println(stringList.stream().filter(s -> s.startsWith("C")).collect(Collectors.toList()));
	
	List <String> newList = stringList.stream().filter(s -> s.startsWith("C")).collect(Collectors.toList());
	
	System.out.println(newList);
	
	
	// sort ()
	
	List<Integer> numbers = new ArrayList<>(Arrays.asList(100,200,39,42,51));
	// sort numbers
	List<Integer> show = numbers.stream().sorted().collect(Collectors.toList());
	System.out.println(show);
	
	// sort stringlist
	List<String> stringListNew = stringList.stream().sorted().collect(Collectors.toList());
	System.out.println(stringListNew);
	
	
	
	// Create a List, store 1,2,3,4,5,6,7,8,9
		// filter only even numbers and store them inside another list
		// print out list
	
	List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	
	List <Integer> newList1 = numbers1.stream().filter(s -> s %2 == 0).collect(Collectors.toList());
	
	//System.out.println(newList1);
	
	newList1.forEach(a -> System.out.println(a));
		
	}
}