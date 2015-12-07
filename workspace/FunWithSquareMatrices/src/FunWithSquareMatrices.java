
public class FunWithSquareMatrices {
	public static final int[][] MATRIX_1 = { {3, 3, 3}, {1, 1, 1}, {2, 2, 2}};
    public static final int[][] MATRIX_2 = { {0, 0, 3}, {0, 2, 2}, {1, 1, 1}};
    
    // Do you believe in magic?
    public static final int[][] MAGIC_MATRIX_1 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}; // yes
    public static final int[][] MAGIC_MATRIX_2 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}; // yes
    public static final int[][] MAGIC_MATRIX_3 = {{2, 7, 12, 13}, {16, 9, 6, 3}, {5, 4, 15, 10}, {11, 14, 1, 8}}; // yes
    public static final int[][] MAGIC_MATRIX_4 = {{2, 7, 6}, {9, 5, 1}, {4, 1, 8}}; // no
    public static final int[][] MAGIC_MATRIX_5 = {{2, 7, 6}, {9, 5, 1}, {5, 3, 8}}; // no
    public static final int[][] MAGIC_MATRIX_6 = {{1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}}; // no    
    
    public static void main(String[] args) {
    	printMatrix(MATRIX_1, true);
    	shiftUp(MATRIX_1);
    	System.out.println("SHIFT");
    	printMatrix(MATRIX_1, true);
    	printMatrix(numberPyramid(1), false);
    	System.out.println(isMagicSquare(MAGIC_MATRIX_1));
    	System.out.println(isMagicSquare(MAGIC_MATRIX_2));
    	System.out.println(isMagicSquare(MAGIC_MATRIX_3));
    	System.out.println(isMagicSquare(MAGIC_MATRIX_4));
    	System.out.println(isMagicSquare(MAGIC_MATRIX_5));
    	System.out.println(isMagicSquare(MAGIC_MATRIX_6));
    	System.out.println(calculateSum(MAGIC_MATRIX_6, 1,1,2,3));
    	printMatrix(numberHourglass(7), false);
    	printMatrix(squarePyramid(10), true);
    	printMatrix(magicBox(7), true);
    }
    
    public static int[][] magicBox(int n){
    	int[][] magic = new int[n][n];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n; j++){
    			magic[i][j] = j;
    		}
    	}
    	
    	return magic;
    }
    public static int[][] squarePyramid(int n){
    	int[][] squarePyramid = new int[n][n];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n; j++){
    			squarePyramid[i][j] = j;
    		}
    	}
    	
    	return squarePyramid;
    }
    public static int[][] numberHourglass(int n){
    	int[][] hourglass = new int[n][n];
    	
    	for(int i = 0; i < n; i++){
    		//Top
    		for(int j = i; j < n - i; j++){
    			hourglass[i][j] = i + 1;
    		}
    		//Bottom
    		for(int j = (n - i) - 1; j < i + 1; j++){
    			hourglass[i][j] = n - i;
    		}
    	}
    	return hourglass;
    }
    public static int calculateSum(int[][] inputMatrix, int topLeftA, int topLeftB, int bottomRightA, int bottomRightB){
    	int sum = 0;
    	for(int i = topLeftA; i <= bottomRightA; i++){
    		for(int j = topLeftB; j <= bottomRightB; j++){
    			sum += inputMatrix[i][j];
    		}
    	}
    	return sum;
    }
    public static boolean isMagicSquare(int[][] matrix){
    	if(matrix.length == matrix[0].length){
	    	int magicNumber = 0;
	    	for(int i = 0; i < matrix.length; i++){
	    		magicNumber += matrix[0][i];       	
	    	}
	    	//Check 2nd dimension addition
        	for(int i = 0; i < matrix.length; i++){
        		int colAddition = 0;
            	for(int j = 0; j < matrix.length; j++){
            		colAddition += matrix[i][j];
            	}
            	if(colAddition != magicNumber){
            		return false;
            	}
        	}
        	
        	//Check diagonal
        	int diagonalAddition = 0;
        	for(int i = 0; i < matrix.length; i++){
        		
        		diagonalAddition += matrix[i][i];

        	}
        	if(diagonalAddition != magicNumber){
        		return false;
        	}
        	
        	//It's all good
        	return true;
    	}
    	return false;
    }

    
    public static int[][] numberPyramid(int n){
    	int[][] output = new int[n][n];
    	
    	for(int i = 0; i < n; i++){
        	for(int j = (n - 1) - i; j < n; j++){
        		output[i][j] = i + 1;
        	}
    	}
    	
    	return output;
    }
    public static void shiftUp(int[][] matrix){
    	int[] temp = new int[matrix[0].length];
    	temp = matrix[0];
    	for(int i = 0; i < matrix.length - 1; i++){
    		matrix[i] = matrix[i + 1];
    	}
    	matrix[matrix.length - 1] = temp;
    }
    public static void printMatrix(int[][] input, boolean printZeros){
    	for (int[] col : input) {
    		printMatrixRow(col, printZeros);
    		System.out.println();
		}
    }
    public static void printMatrixRow(int[] input, boolean printZeros){
		for (int elem : input) {
			if(printZeros || elem > 0){
				System.out.printf("%5d", elem);
			}
			else{
				System.out.printf("%5s", " ");
			}
		}
    }
}
