/*Too easy*/
public class TraversingTwoDimArrays {
    public static void main(String[] args) 
    {
    	
		int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		
		//Sum the elements using a nested for-loop
		int sumOfArrayForLoop = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				sumOfArrayForLoop += matrix[i][j];
			}
		}
		System.out.println("For-Loop: " + sumOfArrayForLoop);
		
		//Sum the elements using a nest for-each loop
		int sumOfArrayForEach = 0;
		for (int[] row : matrix) {
			for(int col : row){
				sumOfArrayForEach += col;
			}
		}
		System.out.println("For-Each: " + sumOfArrayForEach);
		
		//Sum the elements in the matrix by calling addRow() to add each row. Use a for-loop to iterate through each row.
		int sumOfArrayAddRowForLoop = 0;
		for(int i = 0; i < matrix.length; i++){
			sumOfArrayAddRowForLoop += addRow(matrix[i]);
		}
		System.out.println("Add Row For-Loop: " + sumOfArrayAddRowForLoop);
		
		//Sum the elements in the matrix by calling addRow() to add each row. Use a for-each loop to iterate through each row.
		int sumOfArrayAddRowForEach = 0;
		for (int[] row : matrix) {
			sumOfArrayAddRowForEach += addRow(row);
		}
		System.out.println("Add Row For-Each: " + sumOfArrayAddRowForEach);
		
		//Challenge: sum the elements using a for-loop as the outer loop and a for-each loop as the inner loop. 
		int sumOfArrayForLoopOuter = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int col : matrix[i]){
				sumOfArrayForLoopOuter += col;
			}
		}
		System.out.println("For-Loop outer, For-each inner: " + sumOfArrayForLoopOuter);
		
		//Challenge: sum the elements using a for-each loop as the outer loop and a for-loop as the inner loop.
		int sumOfArrayForEachOuter = 0;
		for (int[] row : matrix) {
			for(int j = 0; j < row.length; j++){
				sumOfArrayForEachOuter += row[j];
			}
		}
		System.out.println("For-Each outer, For-Loop inner: " + sumOfArrayForEachOuter);
		
    }
    
    public static int addRow(int[] input){
    	int output = 0;
    	for(int i = 0; i < input.length; i++){
    		output += input[i];
    	}
    	
    	return output;
    }
}
