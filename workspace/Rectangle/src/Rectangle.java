
public class Rectangle {

	public static void main(String[] args) {
		printRectangle(3, 5);
	}
	public static void printRectangle(int rows, int columns) {
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("*");
			}
			System.out.println();                                    
		}
	}
	public static void printRectangle() {
		printRectangle(2,2);
	}
}
