package Week10_Lab;

import java.util.TreeMap;

public class Qustion_8 {

	public static void main(String[] args) {
		
TreeMap<Integer, String> map = new TreeMap<>();

map.put(1, "hasan");
map.put(2, "ihsan");

if(map.containsValue("hasan")){
	System.out.println("found");
}
else{
	System.out.println("not found");
}
	}

}
//Map<String, Integer> map = new TreeMap<String, Integer>();
//
//map.put("Ahmet", 25);
//map.put("Cemil", 26);
//map.put("Bob", 27);
//map.put("Robert", 28);
//
//// containsValue()
// if (map.containsValue(30)) {
//	System.out.println("Value found");
//} else {
//	System.out.println("Value not found");
//}