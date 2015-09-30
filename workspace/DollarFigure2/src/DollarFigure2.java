/* Code for Exercise 2.23
 * 
 * Designed to generate Dollar Figure Shape
 * 
 * SIZE = 3
 * $$$******$$$ 2332
 * **$$****$$** 222222
 * ****$**$****41114
 * 
 * SIZE = 6
 * $$$$$**********$$$$$ 55555
 * **$$$$********$$$$** 24442
 * ****$$$******$$$**** 43334
 * ******$$****$$******
 * ********$**$********
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
			
			for(i = 1 )
			
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
