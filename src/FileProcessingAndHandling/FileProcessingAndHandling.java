package FileProcessingAndHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessingAndHandling {

	public static void main(String[] args) {
		File filePath = new File("C:\\Users\\user\\Desktop\\SampleTextFileToRead.txt");
		Scanner input;
		try {
			input = new Scanner(filePath);

			while(input.hasNext()) {
				String eachLine = input.next();
				System.out.println(eachLine);
			}
			

			input.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			//e.printStackTrace();
		}



	}

}
