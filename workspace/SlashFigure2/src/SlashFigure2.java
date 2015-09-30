/* Code for Exercise 2.17
 * 
 * Designed to generate Slash figure shape
 * 
 * SIZE = 4
 * 	!!!!!!!!!!!!!!
 *	\\!!!!!!!!!!//
 *	\\\\!!!!!!////
 *	\\\\\\!!//////
 * 
 * SIZE = 7
 *	!!!!!!!!!!!!!!!!!!!!!!!!!!
 *	\\!!!!!!!!!!!!!!!!!!!!!!//
 *	\\\\!!!!!!!!!!!!!!!!!!////
 *	\\\\\\!!!!!!!!!!!!!!//////
 *	\\\\\\\\!!!!!!!!!!////////
 *	\\\\\\\\\\!!!!!!//////////
 *	\\\\\\\\\\\\!!////////////
 * 
 * Magic Formulas
 * Slashes = 2x-2
 * Exclamation = 4(inverse of X) - 2
 */



public class SlashFigure2 {
	//Size Variable
	public static final int SIZE = 4;
	
	public static void main(String[] args){
		for(int i = 1; i <= SIZE; i++){
			for(int j = 1; j <= (2 * i) - 2; j++){
				System.out.print("\\");
			}
			
			for(int j = 1; j <= 4 * (SIZE - i) + 2; j++){
				System.out.print("!");
			}
			for(int j = 1; j <= (2 * i) - 2; j++){
				System.out.print("/");
			}
			System.out.println();
		}
	}
}
