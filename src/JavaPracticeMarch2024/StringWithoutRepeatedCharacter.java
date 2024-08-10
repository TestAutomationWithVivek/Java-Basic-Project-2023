package JavaPracticeMarch2024;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringWithoutRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "jaava";
        //o/p = "jv";
        
        Set<String> uniqueAlphabets = new LinkedHashSet<>();
        boolean isAlphabetnotRepeated = false;
        String repeatedAlphabet = null;
        for(int i = 0; i < str.length(); i++) {
        	String eachAlpha = String.valueOf(str.charAt(i));
        	if(uniqueAlphabets.add(eachAlpha) == true) {
        		isAlphabetnotRepeated = true;
        	}else {
        		repeatedAlphabet = eachAlpha;
        		isAlphabetnotRepeated = false;
        	}
        }
        
       Iterator<String> itr = uniqueAlphabets.iterator();
       while(itr.hasNext()) {
    	   String a = itr.next();
    	   if(a.equals(repeatedAlphabet)) {
    		   itr.remove();
    	   }
    	   //System.out.println(a);
       }
       
       System.out.println(uniqueAlphabets.toString());
	}
	
	

}
