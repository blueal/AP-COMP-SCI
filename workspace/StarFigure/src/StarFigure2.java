/* Code for Exercise 2.21
 * 
 * Designed to generate Slash figure shape
 * 
 * SIZE = 3
 * ////////\\\\\\\\8
 * ////********\\\\
 * ****************
 * 
 * SIZE = 6
 *	////////////////////\\\\\\\\\\\\\\\\\\\\20
 *	////////////////********\\\\\\\\\\\\\\\\
 *	////////////****************\\\\\\\\\\\\
 *	////////************************\\\\\\\\
 *	////********************************\\\\
 *	****************************************
 * 
 * Magic Formulas
 * Slashes = 4 * (Inverse of x + 1) - 4
 * Star = y=8x-8
 */



public class StarFigure2 {
	//Size Variable
	public static final int SIZE = 6;
	
	public static void main(String[] args){
		for(int i = 1; i <= SIZE; i++){
			for(int j = 1; j <= (4 * ((SIZE + 1) - i)) - 4; j++){
				System.out.print("/");
			}
			
			for(int j = 1; j <= (8 * i) - 8; j++){
				System.out.print("*");
			}
			for(int j = 1; j <= (4 * ((SIZE + 1) - i)) - 4; j++){
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}
