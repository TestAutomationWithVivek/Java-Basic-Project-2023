package JavaPracticeMarch2024;

public class Ittttt {

	public static void main(String[] args) {
		String fullName = "Vivek Sanjay Fadat";
		String inital = "";
		int counter = 0;
		
		for(int i = 0; i < fullName.length(); i++) {
			if(i == 0) {
				inital = inital+  String.valueOf(fullName.charAt(i));
				counter ++;
			}
			if(fullName.charAt(i) == ' ' && counter != 2){
				inital = inital+ ". " +  String.valueOf(fullName.charAt(i+1));
				counter++;
				i = i+1;
			}
			
			if(fullName.charAt(i) == ' ' && counter == 2) {
				inital = inital+ ". " +  fullName.substring(i+1);
				break;
			}
		}
		
		System.out.println(inital);

	}

}
