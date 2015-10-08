//I could have decomped this project but it wasn't a requirement so I didn't

public class NestedLoopsBonusProject {
	//Size Variable
    public static final int TOTAL_STEPS = 5;
    public static final int STEP_WIDTH = 6; 

	public static void spaceItOut(int i){
		for(int j = i * STEP_WIDTH; j >= 0; j--){
			System.out.print(" ");
		}
	}

	public static void main(String[] args){
		for(int step = TOTAL_STEPS; step >= 1; step--){
			
			for(int row = ((step - 1) * STEP_WIDTH) + (STEP_WIDTH - 3); row >= 1; row--){
				System.out.print(" ");
			}
			System.out.print("o  ");
			for(int stars = STEP_WIDTH; stars >= 1; stars--){
				System.out.print("*");
			}
			System.out.print("*");
			for(int j = ((TOTAL_STEPS - step) * STEP_WIDTH); j >= 1; j--){
				System.out.print(" ");
			}
			System.out.println("*");
			
			
			
			for(int row = ((step - 1) * STEP_WIDTH) + (STEP_WIDTH - 4); row >= 1; row--){
				System.out.print(" ");
			}
			System.out.print("/|\\ *");
			for(int j = ((TOTAL_STEPS - step) * STEP_WIDTH) + STEP_WIDTH; j >= 1; j--){
				System.out.print(" ");
			}
			System.out.println("*");
			
			
			
			for(int row = ((step - 1) * STEP_WIDTH) + (STEP_WIDTH - 4); row >= 1; row--){
				System.out.print(" ");
			}
			System.out.print("/ \\ *");
			for(int j = ((TOTAL_STEPS - step) * STEP_WIDTH) + STEP_WIDTH; j >= 1; j--){
				System.out.print(" ");
			}
			System.out.println("*");

		}
		
		//MAGIC NUMBERS BELOW
		//
		for(int i = (STEP_WIDTH * TOTAL_STEPS) + STEP_WIDTH + 1; i >= 0; i--){
			System.out.print("*");
		}
		
	}
}
