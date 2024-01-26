package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsUsingWildCards {

	public static void main(String[] args) {
		Object myVarObject = new Object();
		String myVarSring = "Hello";
		//polymorphism
		myVarObject = myVarSring;
		
		//commented this code because EmployeeClassForGenerics is changed class to Interface by@vivek againe changewd back to orginal so uncoomented
		EmployeeClassForGenerics emp = new EmployeeClassForGenerics();
		AccountantForGenerics acc = new AccountantForGenerics();
		emp = acc;
		
		ArrayList<EmployeeClassForGenerics> empGenrics = new ArrayList<EmployeeClassForGenerics>();
		empGenrics.add(new EmployeeClassForGenerics());
		ArrayList<AccountantForGenerics> accGenerics = new ArrayList<AccountantForGenerics>();
		accGenerics.add(new AccountantForGenerics());
		//empGenrics = accGenerics; occured compile time error i.e commented the line
		
		//Above problem can be overcome by wildcard "?"
		//Wildcard "?" means any data type, it is used when we are making generic things with Collection
		ArrayList<?> empGenrics1 = new ArrayList<EmployeeClassForGenerics>();
		ArrayList<String> accGenerics1 = new ArrayList<>();
		empGenrics1 = accGenerics1;
		
		//Here in below example wildcard "?" means Child class 
		//Lower bound
		ArrayList<? extends EmployeeClassForGenerics> empGenrics2 = new ArrayList<>();
		ArrayList<AccountantForGenerics> accGenerics2 = new ArrayList<>();
		empGenrics2 = accGenerics2;
		
		//Upper bound
		ArrayList<?  super EmployeeClassForGenerics> empGenrics3 = new ArrayList<>();
		ArrayList<Object> accGenerics3 = new ArrayList<>();
		empGenrics3 = accGenerics3;
		
		makeEmployeeWork(accGenerics);

	}
	
	public static void makeEmployeeWork(List<? extends EmployeeClassForGenerics> employee) {
		for(EmployeeClassForGenerics emp : employee) {
			emp.work();
		}
	}


}
