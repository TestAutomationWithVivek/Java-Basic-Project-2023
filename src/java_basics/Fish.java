package java_basics;

public class Fish extends Animal{

	public Fish(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO Auto-generated constructor stub
	}
	
	public void swim() {
		System.out.println("Fish Swims ...");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Fish is swiming as move");
	}

}
