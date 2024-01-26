package Generics;

public class Container<a1, b1> {
	
	a1 item1;
	b1 item2;
	
	public Container(a1 item1, b1 item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public a1 getItem1() {
		return item1;
	}

	public void setItem1(a1 item1) {
		this.item1 = item1;
	}

	public b1 getItem2() {
		return item2;
	}

	public void setItem2(b1 item2) {
		this.item2 = item2;
	}

	public void printItems() {
		System.out.println("Printing content of Container class : ");
		System.out.println("Item1 = " + item1);
		System.out.println("Item2 = " + item2);
	}

}
