public class doubleString {
	public static void main(String[] args) {
		System.out.println(doubleString("TESTtestTEST"));
		
	}
	public static String doubleString(String phrase){
		String return_string = "";
		for(int i = 0; i <= phrase.length() - 1; i++){
			return_string += phrase.charAt(i);
			return_string += phrase.charAt(i);
		}
		return return_string;
	}
}
