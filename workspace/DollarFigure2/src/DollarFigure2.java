/* Code for Exercise 2.23
 * 
 * Designed to generate Dollar Figure Shape
 * 
 * SIZE = 3
 * $$$******$$$ 023320
 * **$$****$$** 222222
 * ****$**$****41114
 * 
 * SIZE = 5
 * $$$$$**********$$$$$ 0555550
 * **$$$$********$$$$** 24442
 * ****$$$******$$$**** 43334
 * ******$$****$$******
 * ********$**$********
 * 
 */



public class DollarFigure2 {
	//Size Variable
	public static final int SIZE = 3;
	
	public static void main(String[] args){
		for(int i = 1; i <= SIZE; i++){
			for(int j = 1; j <= (2 * i) - 2; j++){
				System.out.print("*");
			}
			for(int j = 1; j <= (SIZE - i) + 1; j++){
				System.out.print("$");
			}
			
			for(int j = 1; j <= SIZE - i + 1; j++){
				System.out.print("*");
			}
			for(int j = 1; j <= SIZE - i + 1; j++){
				System.out.print("*");	
			}
			
			for(int j = 1; j <= (SIZE - i) + 1; j++){
				System.out.print("$");
			}
			for(int j = 1; j <= (2 * i) - 2; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
