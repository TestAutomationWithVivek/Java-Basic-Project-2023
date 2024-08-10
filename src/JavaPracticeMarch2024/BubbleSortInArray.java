package JavaPracticeMarch2024;

public class BubbleSortInArray {
	public static void main(String[] args) {
		int temp, length, array[] = {20,60,40,30,48};
		
		length = array.length;
		
		System.out.println("Initial array is - ");
		for (int elements: array) {
			System.out.print(elements + " ");
		}
		
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Sorted array is - ");
		for (int elements: array) {
			System.out.print(elements + " ");
		}
	}
}