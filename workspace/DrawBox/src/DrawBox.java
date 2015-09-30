
public class DrawBox {
	public static void main(String[] args)
	{
		Box(3);
	}
	
	public static void Box(int numberOfBlocks)
	{

		for (int i = 0; i < numberOfBlocks; i++) {
			System.out.println("+-------+");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("+-------+");
			if(i < numberOfBlocks--){
				System.out.println("");
			}
			
		}
	}
}

