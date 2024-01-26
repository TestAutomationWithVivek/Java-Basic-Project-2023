package FileProcessingAndHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingWithFileReaderAndBufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\user\\Desktop\\SampleTextFileToRead.txt");
		
		//BufferedReader bufferReader = null;
		//FileReader fileReader = null;
		
		//below concept is try with resources introduced in java 7
		try( FileReader fileReader = new FileReader(file);
				BufferedReader bufferReader = new BufferedReader(fileReader);) {
			
			//fileReader = new FileReader(file);//used to read file same like Scanner
			
			
			//bufferReader = new BufferedReader(fileReader); // used to read line of file files
			
			String eachLine = bufferReader.readLine();
			
			while(eachLine != null) {
				System.out.println(eachLine);
				eachLine = bufferReader.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		}finally {
//			try {
//				if(bufferReader != null) {
//					bufferReader.close();
//				}
//				if(fileReader != null) {
//					fileReader.close();
//				}
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		

	}

}
