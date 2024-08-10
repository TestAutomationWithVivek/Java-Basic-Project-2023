package JavaPracticeMarch2024;

import java.util.Map;
import java.util.TreeMap;

public class StringWithAnLengthOrder {

	public static void main(String[] args) {
		String str = "Welcome To The Selenium";
		//o/p = To The Welcome Selenium
		String [] arr = str.split(" ");
		Map<Integer, String> allData = new TreeMap<>();
		for(String a : arr) {
			allData.put(a.length(), a);
		}
		
		System.out.println(allData.toString());
		String eachValue = "";
		for(Map.Entry<Integer, String> eachEntry : allData.entrySet()) {
			eachValue = eachValue  + " "  + eachEntry.getValue();
			
		}
		System.out.print(" String values according to length order = "+ eachValue.trim());
	}

}
