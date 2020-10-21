package Week10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
public class MapTest {

	public static void main(String[] args) {
		
		Map MyMap = new HashMap<>();
		
		MyMap.put("metin", "1952");
		MyMap.put("2012", "meral");
		MyMap.put("2009", "ihsan");
		MyMap.put("zuhal", "ihsan");
		MyMap.put(234, 1977);
		//System.out.println(MyMap);
		System.out.println(MyMap.size());
		MyMap.remove("2012");
		
Set set = MyMap.entrySet();
Iterator iterator = set.iterator();
while(iterator.hasNext()){
	Map.Entry asd=(Entry)iterator.next();
	System.out.println(asd);
}



	}

}
