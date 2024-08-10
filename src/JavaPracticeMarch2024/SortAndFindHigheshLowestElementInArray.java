package JavaPracticeMarch2024;

public class SortAndFindHigheshLowestElementInArray {

	public static void main(String[] args) {
	    int [] arr = {9,8,123,9,8,0,5,1,109,1,1892,1893,9};
	    
	    for(int i = 0; i < arr.length -1; i++){
	        for(int j = 0; j < arr.length -1; j++){
	            if(arr[j] > arr[j+1])  {
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }
	    
	    //Sorted array with bubble sort

	    for(int a : arr) {
	    	System.out.println(a);
	    }
	    
	    int secondndlowElement = arr[0];
	    int secondndhighElement = arr[0];

	    for(int i =0; i < arr.length; i++) {
	    	if(secondndlowElement < arr[i]) {
	    		secondndlowElement = arr[0+1];
	    	}
	    		
	    	if(secondndhighElement < arr[i]) {
	    		secondndhighElement = arr[i-1];
	    	}
	    	
	    	

  }
	    System.out.println("lowest element = "+secondndlowElement + " "+ " highest elemetn = "+ secondndhighElement);
	    
	}

}
