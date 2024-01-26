package CollectionsPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("Brave", "ready to face and endure danger or pain; showing courage");
		hashmap.put("Brilliant", "clever or talented");
		hashmap.put("Joy", "a feeling of great pleasure and happiness.");
		hashmap.put("Confidence", "the feeling or belief that one can have faith in or rely on someone or something.");
	   
		//with keysetfunction we can fetch only keys
//		for(String word : hashmap.keySet()) {
//			System.out.println(word);
//			//getting values for each key
//			System.out.println(hashmap.get(word));
//		}
//		
		
		// If we have to fetch whole entry i.e both key and value then we have to go with entrySet()
		//entrySet as it is pair of key and value its data type will be Map only
		for(Map.Entry<String, String> entryMap : hashmap.entrySet()) {
			System.out.println(entryMap.getKey());
			System.out.println(entryMap.getValue());
		}
	}

}
