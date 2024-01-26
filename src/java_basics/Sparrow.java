package java_basics;

public class Sparrow extends Bird implements Flayable {

	public Sparrow(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO Auto-generated constructor stub
	}
	
	public void fly() {
		System.out.println("Sparrow is to fly");
	}
}
