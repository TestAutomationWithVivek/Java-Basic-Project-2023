package JavaPracticeMarch2024;

public class find_Even_Odd_In_a_Number {

	public static void main(String[] args) {
		int n = 123456789;
		int even = 0;
		int odd = 0;
		
		while(n != 0) {
			int lastDigit = n %10;
			if(lastDigit%2 == 0) {
				System.out.println(lastDigit + " the number is even ");
				even ++;
			}else {
				System.out.println(lastDigit + " the number is odd ");
				odd ++;
			}
			n = n/10;
		}
		
		System.out.println(" Total even numbers = " + even);
		System.out.println(" Total odd numbers = " + odd);

	}

}
