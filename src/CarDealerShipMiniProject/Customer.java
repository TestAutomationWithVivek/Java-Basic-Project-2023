package CarDealerShipMiniProject;

public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	

	public Customer(String name, String address, double cashOnHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address += "Dealership city";
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500;
		this.cashOnHand = cashOnHand;
	}
	
    public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		
		employee.handleCustomer(this, finance, vehicle);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", cashOnHand=" + cashOnHand + "]";
	}
    
    
	
	

}
