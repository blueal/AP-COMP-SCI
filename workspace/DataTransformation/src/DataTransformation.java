
public class DataTransformation {
	public static void main(String[] args) {
		String[] arr = {"test", "TESTESTE1", "TESTESTE2"};
		String test = "Star Wars: Episode VII The Force Awakens";
		System.out.println(splitString(test));
	}
	
	public static int splitString(String input){
		
		//Well start with counting the words in the string
		int wordCount = 1;
		for(int i = 0; i < input.length() - 1; i++){
			if(input.substring(i, i + 1).equals(" ")){
				wordCount++;
			}
		}
		
		//Initialize Array
		String[] output = new String[wordCount];
	
		//Start saving words into array slots
		for(int i = 0; i < input.length() - 1; i++){
			if(input.substring(i, i + 1).equals(" ")){
				
			}
		}
		
		return wordCount;
	}
	
	public static String maxWordLength(String[] list){
		String longestWord = "";
		for (String listItem : list) {
		    if(listItem.length() > longestWord.length()){
		    	longestWord = listItem;
		    }
		}
		return longestWord;
	}
}
