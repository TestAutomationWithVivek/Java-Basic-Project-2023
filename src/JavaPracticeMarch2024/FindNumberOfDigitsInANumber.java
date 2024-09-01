package JavaPracticeMarch2024;

public class FindNumberOfDigitsInANumber {

	public static void main(String[] args) {
		int n = 123456;
		int count = 0;

		while(n !=0){
		count++;
		 n = n / 10;
		} 
		
		System.out.println(count);

	}

}
