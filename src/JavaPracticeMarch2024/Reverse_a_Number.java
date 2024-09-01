package JavaPracticeMarch2024;

public class Reverse_a_Number {

	public static void main(String[] args) {
		int n = 123456;
		String rev= "";

		while(n !=0){
		 int lastD = n % 10;
		 rev = rev + lastD;
		 n = n / 10;
		} 
		
		System.out.println(rev);

	}
	
	

}
