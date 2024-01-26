package CarDealerShipMiniProject;

public class Dealership {

	public static void main(String[] args) {
		// Q. write a program to simulate a car dealership sales process. 
		// will have employees working selling vehicles to customers.
		
		Customer customer =  new Customer("Vivek", "Pune, Maharashtra, India", 4);
//		customer.setName("Vivek");
//		customer.setAddress("Pune, Maharashtra, India");
//		customer.setCashOnHand(4000000);
		
		Vehicle vehicle = new Vehicle("honda", "accord", 5000000);
//		vehicle.setMake("honda");
//		vehicle.setModal("accord");
//		vehicle.setPrice(100000);
		
		Employee employee = new Employee();
		
		customer.purchaseCar(vehicle, employee, false);
		
		
		Vehicle car = new Vehicle("honda", "accord", 5000000);
		
		System.out.println(car.equals(vehicle));
		
		/**
		 * handleCustomer(Customer customer, boolean finance, Vehicle vehicle)
		 * if(finance == true){
		 * runCreditHistory(Customer customer, Double loanAmount)
		 * }
		 * elseIf(vehicle.getPrice() <= customer.getCashOnHand(){
		 * processTransection(Customer customer, Vehicle vehicle)
		 * }
		 * else{
		 * tell customer to bring more money
		 * }
		 */

	}

}
