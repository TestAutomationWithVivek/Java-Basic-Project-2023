package JavaPracticeMarch2024;

public class InitialFromFullName {
	public static void main(String[] args) {
		int counter = 0;
		String initial = "", fullName = "Vivek Sanjay Fadat";
		
		System.out.println("Person's Full-Name is - '" + fullName + "'");
		
		for (int i = 0; i < fullName.length(); i++) {
			if (i == 0) {
				initial = initial.concat(String.valueOf(fullName.charAt(i)));
				counter += 1;
			} else if (fullName.charAt(i) == ' ' && counter != 2) {
				initial = initial.concat(". " + String.valueOf(fullName.charAt(i + 1)));
				counter += 1;
			} else if (fullName.charAt(i) == ' ' && counter == 2) {
				initial = initial.concat(". " + fullName.substring(i+1));
				break;
			}
		}
		
		System.out.println("Person's initials are - '" + initial + "'");
	}
}