import java.util.*;

public class SentinelLoop {
	
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		boolean takeInput = true;
		//int[] numberList = new int[count];
		int sum = 0;
		int number = 0;
		while(takeInput){
			System.out.print("Enter number: ");
			number = console.nextInt();
			if(number == -1){
				takeInput = false;
			}
			else{
				sum += number;
			}
		}
		System.out.println(sum);
	}
}
