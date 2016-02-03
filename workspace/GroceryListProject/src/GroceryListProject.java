
public class GroceryListProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroceryItemOrder item1 = new GroceryItemOrder("cookies", 4, 1.25);
		GroceryItemOrder item2 = new GroceryItemOrder("milk", 2, 2.50); 
		
		GroceryList list1 = new GroceryList();
		
		list1.add(item1);
		list1.add(item2);
		
		System.out.println(list1);

	}

}
