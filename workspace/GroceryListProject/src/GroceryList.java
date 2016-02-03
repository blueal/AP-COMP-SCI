import java.util.Arrays;

public class GroceryList {
	private GroceryItemOrder[] groceryListItems;
	
	public GroceryList(){
		this.groceryListItems = new GroceryItemOrder[0];
	}
	
	public void add(GroceryItemOrder item){
		this.groceryListItems = Arrays.copyOf(this.groceryListItems, this.groceryListItems.length + 1);
		this.groceryListItems[this.groceryListItems.length - 1] = item;
	}
	
	public String toString(){
		String output = "[";
		if(this.groceryListItems.length > 0){
			for(int i = 0; i < this.groceryListItems.length; i++){
				output += this.groceryListItems[i].toString();
				if(this.groceryListItems.length > 1 && i < this.groceryListItems.length - 1){
					output += ", ";
				}
			}
		}
		return output + "]";
	}
	
}
	

