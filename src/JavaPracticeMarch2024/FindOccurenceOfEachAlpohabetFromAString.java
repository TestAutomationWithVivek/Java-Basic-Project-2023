package JavaPracticeMarch2024;

import java.util.ArrayList;
import java.util.List;

public class FindOccurenceOfEachAlpohabetFromAString {
	public static void main(String[] args) {
		int counter = 0;
		List<String> distinctChars = new ArrayList<>();
		String actualString = "aaaAAbbbbBBBcccccCCCCddDDeE";
		
		for (int i = 0; i < actualString.length(); i++) {
			if (!distinctChars.contains(String.valueOf(actualString.charAt(i))))
				distinctChars.add(String.valueOf(actualString.charAt(i)));
		}
		
		System.out.println("The String has these characters - " + distinctChars.toString());
		
		for (int i = 0; i < distinctChars.size(); i++) {
			counter = 0;
			
			for (int j = 0; j < actualString.length(); j++) {
				if (String.valueOf(actualString.charAt(j)).contentEquals(distinctChars.get(i)))
					counter += 1;
			}
			
			System.out.println("Occurence of - '" + distinctChars.get(i) + "' is - '" + counter + "' times");
		}
	}
}