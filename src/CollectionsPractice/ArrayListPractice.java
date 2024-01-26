package CollectionsPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Vivek");
		a.add("hfjhf");
		a.add("H");
		a.add("10");
		
//		for(String b : a) {
//			System.out.println(b);
//		}
		
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle vehicle1 = new Vehicle("alto", "Nano", 10000, true);
		vehicles.add(new Vehicle("Maruti", "jaguar", 250000, false));
		vehicles.add(vehicle1);
		vehicles.add(new Vehicle("Jeep", "DJkjdkjkd", 4646465, true));
		
		/*
		 * for(Vehicle car : vehicles) { //System.out.println(car);
		 * System.out.println(car.getName()); System.out.println(car.getModal());
		 * System.out.println(car.getPrice());
		 * 
		 * 
		 * //With the help of toString function in Vehicle Class
		 * //System.out.println(car);
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		
		printListElements(a);
		printListElements(vehicles);
	}
	
	//Creating generic method to print the both List objects
	public static void printListElements(List someList) {
		for(int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}

}
