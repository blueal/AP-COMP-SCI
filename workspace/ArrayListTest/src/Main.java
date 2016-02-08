import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(500);
		list2.add(500);
		
		if(list2.get(0) == list2.get(1)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
			
	}

}
