public class NestedLoopsProgrammingProject {
	//DECLARE VARIABLES
	public static int TOTAL_ROWS = 100;
	
	public static void HeaderAndFooter(){
		//Put this stuff at the top and bottom
		System.out.print("|");
		for(int i = (TOTAL_ROWS * 2); i >= 0; i--){
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static void main(String[] args)
	{		
		//START TOP HALF
		HeaderAndFooter();
		for(int i = TOTAL_ROWS - 1; i >= 0; i--){
			
			//Print out the spaces at the beginning (A space for each row number)
			for(int j = (TOTAL_ROWS - 1) - i; j >= 0; j--){
				System.out.print(" ");
			}
			
			//Start the first backslash
			System.out.print("\\");
			
			for(int j = i * 2; j >= 0; j--){
				//Print out a bunch of colons. (Twice as many for the inverse of the row number)
				System.out.print(":");
			}
			
			//End of the line, close it off
			System.out.println("/");
		}
		
		//HALFWAY POINT
		
		for(int i = 0; i <= TOTAL_ROWS - 1; i++){
			
			//Print out the spaces at the beginning (A space for each row number)
			for(int j = (TOTAL_ROWS - 1) - i; j >= 0; j--){
				System.out.print(" ");
			}
			
			//Start the First Backslash
			System.out.print("/");
			
			//Type double the row number of colons
			for(int j = i * 2; j >= 0; j--){
				System.out.print(":");
			}
			
			//End the line
			System.out.println("\\");
		}
		
		HeaderAndFooter();

	}

}