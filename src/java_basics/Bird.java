package java_basics;

public class Bird extends Animal{
	
	public Bird(int age, String gender, int weight) {
		super(age, gender, weight);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bird Flopping wings......");
		
	}
	
	public void fly() {
		System.out.println("this bird is to fly");
	}

}
