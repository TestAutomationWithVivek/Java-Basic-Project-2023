package LoopsPractice;

public class ForLoopPractice {

	public static void main(String[] args) {
		String randomString = "xhhcckkxvhiihaxihhivhihhdihvhihidhv";
		//we need to reverse the character of string and print
		
		for(int i = randomString.length()-1; i >= 0; i--) {
			System.out.println("Char At postion = "+ randomString.charAt(i));
		}

	}

}
