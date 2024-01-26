package CollectionsPractice;

public class Vehicle {
	
	private String name;
	
	private String modal;
	
	private double price;
	
	private boolean forDrive;

	public Vehicle(String name, String modal, double price, boolean forDrive) {
		super();
		this.name = name;
		this.modal = modal;
		this.price = price;
		this.forDrive = forDrive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModal() {
		return modal;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", modal=" + modal + ", price=" + price + ", forDrive=" + forDrive + "]";
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isForDrive() {
		return forDrive;
	}

	public void setForDrive(boolean forDrive) {
		this.forDrive = forDrive;
	}
	

}
