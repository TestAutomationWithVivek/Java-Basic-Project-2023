package Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
//		ArrayList arrayList = new ArrayList();
//		
//		arrayList.add("Vivek");
//		arrayList.add(10);
//		arrayList.add(true);
//		arrayList.add('C');
//		
//		//This should not be ideal pravice to be followed that is why 
//		//we should create generic function to accommodate each and every data type
//		String var1 = (String) arrayList.get(0);
//		
//		//Although here data is of type int , it is not showing errorbut at run time we will get class catched exception 
//		String  var2 = (String) arrayList.get(1);

		//Generic class and use to get any data type value
		Container<String, Integer> container = new Container<>("hello", 1);
		String val1 = container.getItem1();
		int val2 = container.getItem2();
		System.out.println("Item 1 = " + val1);
		System.out.println("Item 2 = " + val2);
		
		
		//code for union of two set
		Set<String> set1 = new HashSet<>();
		set1.add("First");
		set1.add("Second");
		set1.add("Spanish");
		
		Set<String> set2 = new HashSet<>();
		set2.add("First");
		set2.add("Second");
		set2.add("English");
		
		Set <String> resultOfUnionSet = new HashSet<>();
		resultOfUnionSet = union(set1, set2);
		//in order to iterate collecton object we can use iterator class method
		Iterator<String> itr = resultOfUnionSet.iterator();
		while(itr.hasNext()) {
			
			String valOfSet = itr.next();
			System.out.println(valOfSet);
		}
	
	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set <E> resultSet =  new HashSet<>(set1);
		resultSet.addAll(set2);
		return resultSet;
	}

}
