package JavaPracticeMarch2024;

public class findSecondHighestAndLowestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 30, 40, 50, 60, 70};
		int secondmin = arr[0];
		int secondhigh = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(secondmin < arr[i]) {
				secondmin = arr[0+1];
				
			}
			
			if(secondhigh < arr[i]) {
				secondhigh = arr[i-1];
			}
		}
		
		System.out.println("second minimum value = " + secondmin + " second max value "+ secondhigh);

	}

}
