package java_basics;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sparrow sparrow = new Sparrow(4, "M", 30);
		//sparrow.move();
		
		//Fish fish = new Fish(5, "F", 40);
		//fish.move();
		
		Animal sparrow = new Sparrow(4, "M", 30);;
		//sparrow.move();
		
		Animal fish = new Fish(5, "M", 40);
		//fish.move();
		
		moveAnimal(fish);
		moveAnimal(sparrow);
		
		//to understand inferface call written below code
		Flayable flaybaleBbudhu = new Sparrow(4, "F", 45);
		//Flayable flaybaleBbudhu1 = new Bird(0, null, 0); compile time error as bird is not implementing Flayabale
		

	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
