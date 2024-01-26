package CollectionsPractice;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		//In HashMap duplicates are not allowed, insertion order is not preserved
		//In LinkedHashMap duplicates ae not allowed, insertion order is preserved
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 5);
		Animal animal3 = new Animal("Dog", 12);
		Animal animal4 = new Animal("Mouce", 6);
		Animal animal5 = new Animal("Horse", 15);
		Animal animal6 = new Animal("Bird", 4);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		
		System.out.println(animal1.equals(animal3));
		System.out.println(animal1.hashCode());
		System.out.println(animal3.hashCode());
		
		for(Animal value : animals) {
			System.out.println(value);
		}

	}

}
