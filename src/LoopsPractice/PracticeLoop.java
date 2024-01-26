package LoopsPractice;


public class PracticeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "We have a large invontory of things in our warehouse falling in" 
				+ "the category: Apperal and slightly"
				+ "more in demand category: makeup along with category: furniture and...";
		
		//use substring(String start, String end);
		//indexOf(String s, int i);
		//while(){}
		
		//Q. Extract all categories from the above string
		
		//extractcategories(str);
		//findCategories(str);
		extractStringFromSentence();

	}
	
	public static void extractcategories(String str) {
		System.out.println(str.indexOf("category", 0));
		//System.out.println(str.substring("category", "f:"));
		int i = 0;
		while(i <= str.length()) {
			int CategoryFound = str.indexOf("category", i);
			if(CategoryFound == -1) {
				break;
			}
			int start = CategoryFound + 9;// start of actual category
			int end  = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			String abc = str.substring(start, end);
			System.out.println(abc);
			i = end +1;
		}
		
	}
	
	public static void findCategories(String str) {
		for(int i = 0; i <= str.length(); i ++) {
			int CategoryFound = str.indexOf("category: ", i);
			int start = CategoryFound + 9;// start of actual category
			System.out.println(CategoryFound);
			System.out.println(str.indexOf(start, CategoryFound));
			
		}
	}
	
	public static void extractStringFromSentence() {
		String[] subStrings;
		//String sentence = "We have a large inventory of things in our Warehouse falling in the Category: Apparel and slightly"
//		        + "more in demand Category: Make-Up along with Category: Furniture and...";
		String sentence = "We have a large inventory of things in our Warehouse falling in the Category: General,Gifts and slightly"
		        + "more in demand Category: Make-Up,Beauty along with Category: Furniture,Interior and...";

		subStrings = sentence.split("Category:");
		System.out.println(subStrings.length-1);

		for (int i = 1; i < subStrings.length; i++){
			System.out.println(subStrings[i]);
		}
		    //System.out.println(subStrings[i].trim().substring(0, subStrings[i].trim().indexOf(" ")));

	}
	
	

}
