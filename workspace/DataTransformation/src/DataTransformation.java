
public class DataTransformation {
	public static void main(String[] args) {
		String[] arr = {"test", "TESTESTE1", "TESTESTE2"};
		System.out.println(maxWordLength(arr));
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
