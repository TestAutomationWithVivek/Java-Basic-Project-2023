package CarDealerShipMiniProject;

public class Employee {
	
	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);
		}else if(vehicle.getPrice() <= customer.getCashOnHand()){
			// customer pays in cash
			processTransection(customer, vehicle);
		}else {
			System.out.println("Customer does not have enough money, transection cannot be initiated ");
		}
	}
	
	public static void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Run credit history for customer");
		System.out.println(" Customer is eligible to purchase car");
	}
	
	public static void processTransection(Customer customer, Vehicle vehicle) {
		System.out.println("Customer has purchaced the " + vehicle + " for the price " + vehicle.getPrice());
	}

}
