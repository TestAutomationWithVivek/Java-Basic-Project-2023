package JavaPracticeMarch2024;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface DemoInterface {
	void printSomething(String message1, String message2);
}

//class Implementation implements DemoInterface {
//	public void printSomething(String message1) {
//		System.out.println("Printing - " + message1);
//	}	
//}

public class LambdaDemo {
	
	
	public static void main(String[] args) {
		List<String> abcd = new ArrayList<>();
		abcd.add("Vivek");
		abcd.add("TCS");
		abcd.add("Rahul Bhai");
		abcd.add("PG Anna");
		
		abcd.forEach(a -> System.out.println(a));
		
		//Way 1
//		Implementation lDemo = new Implementation();
//		lDemo.printSomething("Your Output 1");
		
		//Way 2
//		DemoInterface lDemo2 = new DemoInterface() {
//			public void printSomething(String message1) {
//				System.out.println("Printing - " + message1);
//			}
//		};
//		lDemo2.printSomething("Your Output 2");
		
		DemoInterface dInt = (message1, message2) -> {
			System.out.println("Printing - " + message1);
			System.out.println("Done & Dusted");
		};
		dInt.printSomething("Your Output 3", "Lambds Expression");
	}
}