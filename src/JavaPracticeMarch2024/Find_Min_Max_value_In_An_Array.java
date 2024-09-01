package JavaPracticeMarch2024;

public class Find_Min_Max_value_In_An_Array {

	public static void main(String[] args) {
		int a[] = {20,50,70,40,60,10,80,30};
		int min = a[0];
		int max = a[0];
		
		for(int i = 0; i<a.length-1; i++) {
			if(min > a[i]) {
				min = a[i];
			}else if(max < a[i]) {
				max = a[i];
			}
		}
		
		System.out.println("min value in an array = " + min);
		System.out.println("min value in an array = " + max);

	}

}
