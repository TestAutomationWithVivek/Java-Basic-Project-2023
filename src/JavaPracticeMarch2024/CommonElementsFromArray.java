package JavaPracticeMarch2024;

public class CommonElementsFromArray {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 4, 9, 3, 1, 2, 8, 3};
		int[] array2 = {2, 3, 5, 4, 6, 87};
		int[] array3 = {1, 2, 4, 78, 89};
		int[] finalArray;
		int smallest, largest, length1 = array1.length, length2 = array2.length, length3 = array3.length;
		
		if (length1 <= length2) {
			if (length1 <= length3) {
				if (length2 <= length3) {
					smallest = length1;
					largest = length3;
				} else {
					smallest = length1;
					largest = length2;
				}
			} else {
				if (length2 <= length3) {
					smallest = length2;
					largest = length3;
				} else {
					smallest = length3;
					largest = length2;
				}
			}
		} else {
			if (length2 <= length3) {
				if (length1 <= length3) {
					smallest = length2;
					largest = length3;
				} else {
					smallest = length2;
					largest = length1;
				}
			} else {
				if (length1 <= length3) {
					smallest = length3;
					largest = length2;
				} else {
					smallest = length3;
					largest = length1;
				}
			}
		}
		
		System.out.println("Smallest Array-Length is - '" + smallest + "'");
		System.out.println("Largest Array-Length is - '" + largest + "'");
	}
}