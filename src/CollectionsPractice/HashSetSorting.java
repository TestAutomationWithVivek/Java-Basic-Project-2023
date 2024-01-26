package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetSorting {

	public static void main(String[] args) {
		
		//Sorting integers value via HashSet
		HashSet<Integer> values = new HashSet<Integer>();
		
		values.add(22);
		values.add(45);
		values.add(46);
		values.add(12);
		values.add(78);
		values.add(63);
		values.add(36);
		values.add(98);
		values.add(114);
		
		//Converting HashSet into ArrayList as sort method available for list arguments
		//This is natural sorting
		ArrayList<Integer> myList = new ArrayList<Integer>(values);
		Collections.sort(myList);
		//System.out.println(myList);
		
		
		//Sorting String via HashSet
		HashSet<String> hashsetOfString = new HashSet<String>();
		hashsetOfString.add("Vivek");
		hashsetOfString.add("Vijay");
		hashsetOfString.add("Sachin");
		hashsetOfString.add("Pravin");
		hashsetOfString.add("Akon");
		hashsetOfString.add("Jenefer");
		hashsetOfString.add("Jordan");
		hashsetOfString.add("Jaacob");
		hashsetOfString.add("Salman");
		
		ArrayList<String> arrayListString = new ArrayList<String>(hashsetOfString);
		Collections.sort(arrayListString);
		//System.out.println(arrayListString);
		
		
		//Sorting User defined Class objects data in customized way with salary
		HashSet<Employee> employeesHashSet = new HashSet<Employee>();
		employeesHashSet.add(new Employee("Vivek", 25000, "Electrical"));
		employeesHashSet.add(new Employee("Sam", 10000, "Civil"));
		employeesHashSet.add(new Employee("Arjun", 200000, "Computer"));
		employeesHashSet.add(new Employee("Sayali", 50000, "Electronics"));
		
		ArrayList<Employee> employeeArrayList = new ArrayList<Employee>(employeesHashSet);
		Collections.sort(employeeArrayList);
		System.out.println(employeeArrayList);
	}

}
