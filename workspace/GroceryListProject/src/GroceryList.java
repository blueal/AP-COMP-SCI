
public class GroceryList {
	private String[] groceryListItems = new String[0];
	private int[] groceryListQuantity = new int[0];
	private int[] groceryListCost = new int[0];
	
	public String toString{
		String output = "[";
		for(int i = 0; i < groceryListItems.length; i++){
			output += groceryListItems[i] + "/";
			output += groceryListQuantity[i] + "/";
			output += groceryListCost[i] + "/";
			if(i < groceryListItems.length - 1){
				output += ", ";
			}
		}
		return output;
	}
}
