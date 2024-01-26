package java_basics;

public abstract class Animal {
	 public int age;
	 public int weight;
	 public String gender;
	 
	 public Animal(int age, String gender, int weight) {
		 this.age = age;
		 this.weight = weight;
		 this.gender = gender;
	 }
	 
	 public void eat() {
		 System.out.println("Animal eats ....");
	 }
	 
	 public void sleeps() {
		 System.out.println("Animal Seeps .......");
	 }
	 
	 public abstract void move();

}
