/* Code for Exercise 2.19
 * 
 * Designed to generate a window
 * 
 * SIZE = 3
 * 	+===+===+
 *  |   |   |
 *  |   |   |
 *  |   |   |
 *  +===+===+
 *  |   |   |
 *  |   |   |
 *  |   |   |
 *  +===+===+
 * 
 */



public class Window {
	//Size Variable
	public static final int SIZE = 3;
	
	public static void verticalWindow(){
		for(int row = 1; row<= SIZE; row++){
			System.out.print("|");
			for(int i = 1; i <= SIZE; i++){
				System.out.print(" ");
			}
			System.out.print("|");
			for(int i = 1; i <= SIZE; i++){
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	public static void frame(){
		System.out.print("+");
		for(int i = 1; i <= 2; i++){
			for(int k = 1; k <= SIZE; k++){
				System.out.print("=");
			}
			System.out.print("+");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
			frame();
			verticalWindow();
			frame();
			verticalWindow();
			frame();
		
	}
}
