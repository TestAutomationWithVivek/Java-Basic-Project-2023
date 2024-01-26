package CarDealerShipMiniProject;

import java.util.Objects;

public class Vehicle {
	private String make;
	private String modal;
	private double price;
	
	public Vehicle(String make, String modal, double price) {
		super();
		this.make = make;
		this.modal = modal;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		
		return price;
	}
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", modal=" + modal + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, modal, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(make, other.make) && Objects.equals(modal, other.modal)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	


}
