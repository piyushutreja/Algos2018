package custom.hashmap;

import org.junit.Test;

public class CustomHashMapTest {
	
	

	public static void main(String args [])
	
	{
	
	Map<String,String> myMap =	new CustomHashMap<>();
	
	myMap.put("piyush", "One");
	myMap.put("piyush", "Two");
	myMap.put("Manisha","Three");
	myMap.put("Sushil", "Fourth");
	
	
	System.out.println(myMap.get("piyush"));
	
	}	


}
