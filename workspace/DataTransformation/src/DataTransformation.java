import java.util.Arrays;;

public class DataTransformation {
	
    public static final String TEXT_1 = "Star Wars: Episode VII The Force Awakens";
    public static final String TEXT_2 = "A long time ago in a galaxy far, far away..."; 
    public static final String TEXT_3 = "There's been an awakening. Have you felt it? The Dark side, and the Light.";
    public static final String TEXT_4 = "It's true. All of it. The Dark Side, the Jedi. They're real.";
    public static final String TEXT_5 = "The Force is strong in my family. My father has it. I have it. My sister has it. You have that power, too.";
    public static final String TEXT_6 = "I have to remind myself that some birds aren't meant to be caged. Their feathers are just too bright.";
    public static final String TEXT_7 = "Remember Red, hope is a good thing, maybe the best of things, and no good thing ever dies.";
    public static final String TEXT_8 = "Life is like a box of chocolates. You never know what you’re gonna get.";
    public static final String TEXT_9 = "I think this is the beginning of a beautiful friendship";
    public static final String TEXT_10 = "This is your last chance. After this, there is no turning back. "
            + "You take the blue pill, the story ends, you wake up in your bed and believe whatever you want to believe. "
            + "You take the red pill, you stay in Wonderland and I show you how deep the rabbit hole goes.";
    public static final String TEXT_11 = "this this is is cool cool cool";
    public static final String TEXT_12 = "cool is is this";
    
    public static final String[] TEXT_LIST = {TEXT_1, TEXT_2, TEXT_3, TEXT_4, TEXT_5, TEXT_6, TEXT_7, TEXT_8, TEXT_9, TEXT_10};

	
	public static void main(String[] args) {
		/*EXCERCISE 2*/
		String[] excercise2 = splitString(TEXT_2);
		System.out.println("Excercise 2");
		System.out.println("Sentence: " + TEXT_2);
		System.out.println("\tNumber of words: " + excercise2.length);
		System.out.println("\tMax word length: " + maxWordLength(excercise2));
		System.out.println("");
		
		/*EXCERCISE 3*/
		System.out.println("Excercise 3");
		System.out.println("Intersection of:");
		System.out.println("\tSentence: " + TEXT_11);
		System.out.println("\tSentence: " + TEXT_12);
		System.out.println("Produces: " + Arrays.toString(intersectWords(TEXT_11, TEXT_12)));
		System.out.println("");
		System.out.println("Intersection of:");
		System.out.println("\tSentence: " + TEXT_1);
		System.out.println("\tSentence: " + TEXT_9);
		System.out.println("Produces: " + Arrays.toString(intersectWords(TEXT_1, TEXT_9)));
		System.out.println("");
		
		/*EXCERCISE 4*/
		System.out.println("Excercise 4: Tally of Word Lengths in TEXT_LIST");
		System.out.println("");
		wordLengthsTally(TEXT_LIST);
		
	}
	
	public static void wordLengthsTally(String[] input){
		
		//Find the longest element by word count in the array 
		int longestArray = Integer.MIN_VALUE;
		for(int i = 0; i < input.length; i++){
			if(wordCount(input[i]) > longestArray){
				longestArray = wordCount(input[i]);
			}
			
		}
		
		//Create the 2D array. Note that there will be a lot of null elements
		String[][] words = new String[input.length][longestArray];
		
		//Put everything in the 2D array
		for(int i = 0; i < input.length; i++){
			String[] temp = splitString(input[i]);
			for(int j = 0; j < temp.length; j++){
				words[i][j] = temp[j];
			}
		}
		
		//Find the longest word that exists, save its length
		int longestWord = Integer.MIN_VALUE;
		for(int i = 0; i < words.length; i++){
			if(maxWordLength(words[i]) > longestWord){
				longestWord = maxWordLength(words[i]);
			}
		}
		
		//Keep a 1D array for the tally
		int[] count = new int[longestWord];
		
		//Count how many words are of each length
		for(int i = 0; i < words.length; i++){
			for(int j = 0; j < words[i].length; j++){
				//Make sure to prevent NullPointerException
				if(words[i][j] != null && !words[i][j].isEmpty()){
					count[words[i][j].length() - 1]++;
				}
			}
		}
		
		//Print the results
		for(int i = 0; i < count.length; i++){
			System.out.println("Number of words of length " + (i + 1) + ": " + count[i]);
		}
		

	}
	
	public static String[] intersectWords(String input1, String input2){
		//
		
		
		
		
		
		
		
		
		
		
		String[] inputA = splitString(input1);
		String[] inputB = splitString(input2);
		int sameWordCount = 0;
		
		
		for(int i = 0; i < inputA.length; i++){
			boolean repeatWord = false;
			if(i > 0){
				for(int j = 0; j < i; j++){
					if(inputA[i].equals(inputA[j])){
						repeatWord = true;
					}
				}
			}
			
			if(!repeatWord){
				for(int j = 0; j < inputB.length; j++){
					if(inputA[i].equals(inputB[j])){
						sameWordCount++;
						break;
					}
				}
			}
		}
		
		String[] output = new String[sameWordCount];
		
		if(sameWordCount > 0){
			
			int outputIndex = 0;
			for(int i = 0; i < inputA.length; i++){
				boolean repeatWord = false;
				if(i > 0){
					for(int j = 0; j < i; j++){
						if(inputA[i].equals(inputA[j])){
							repeatWord = true;
						}
					}
				}
				
				if(!repeatWord){
					for(int j = 0; j < inputB.length; j++){
						if(inputA[i].equals(inputB[j])){
							output[outputIndex] = inputA[i];
							outputIndex++;
							break;
						}
					}
				}
			}
		}
		
		return output;
		
	}
	
	
	public static String[] splitString(String input){
		
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
		//Scan from left to right, saves each word into the array except the last
		int wordIndex = 0;
		for(int i = 0; i < wordCount - 1; i++){
			for(int j = wordIndex; j < input.length() - 1; j++){
				if(input.substring(j, j + 1).equals(" ")){
					output[i] = input.substring(wordIndex, j);
					wordIndex = j + 1;
					break;
				}
			}
		}
		
		//Save the last word by scanning right to left
		for(int i = input.length() - 1; i >= 0; i--){
    		if(input.substring(i, i + 1).equals(" ")){
    			output[output.length - 1] = input.substring(i + 1);
    			break;
    		}
    	}
		
		return output;
	}
	
	public static int wordCount(String input){
		
		int wordCount = 1;
		for(int i = 0; i < input.length() - 1; i++){
			if(input.substring(i, i + 1).equals(" ")){
				wordCount++;
			}
		}
		
		return wordCount;
	}
	
	public static int maxWordLength(String[] list){
		int longestWord = Integer.MIN_VALUE;
		for (String listItem : list) {
			//We must protect against NULL POINTER EXCEPTION!!!
			if(listItem != null && !listItem.isEmpty()){
			    if(listItem.length() > longestWord){
			    	longestWord = listItem.length();
			    }
			}
		}
		return longestWord;
	}
	
}
