package JavaPracticeMarch2024;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String s = "the sky is blue";
		//output = example good a
		
		String [] arr = s.split(" ");

        String result = "";
        for(int i = arr.length-1; i >= 0; i --){
        	
        	boolean eachString = arr[i].trim().isEmpty();
        	if(eachString == false) {
        		result = result + " "+ arr[i];
        	}else {
        		System.out.println(" white space wali array ");
        	}
        	
        }

        System.out.println(result.trim());
	}

}
