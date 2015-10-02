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



public class NestedLoopsBonusProject {
	//Size Variable
    public static final int TOTAL_STEPS = 5;
    public static final int STEP_WIDTH = 5; 

	public static void spaceItOut(int i){
		for(int j = i * STEP_WIDTH; j >= 0; j--){
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args){
		for(int i = TOTAL_STEPS; i >= 0; i--){
			for(int j = (i * STEP_WIDTH) - 1; j >= 0; j--){
				System.out.print(" ");
			}
			
			for(int j = 1; j <= STEP_WIDTH; j++){
				System.out.print("*");
			}
			
			//Back of the stair star
			for(int j = (TOTAL_STEPS * STEP_WIDTH) - (i * STEP_WIDTH); j >= 0; j--){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		//Bottom
		for(int i = 1; i <= (TOTAL_STEPS * STEP_WIDTH); i++){
			System.out.print("*");
		}
	}
}
