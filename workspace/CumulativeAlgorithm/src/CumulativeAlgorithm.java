import java.util.*;
public class CumulativeAlgorithm {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int smallestValue = Integer.MAX_VALUE;
		int largestValue = Integer.MIN_VALUE;
		int largestEvenValue = Integer.MIN_VALUE;
		int evenNumberSum = 0;
		System.out.print("How many numbers to read: ");
		int count = console.nextInt();
		int[] numberList = new int[count];
		for(int i = 0; i < count; i++){
			System.out.print("Enter number " + (i + 1) + ": ");
			numberList[i] = console.nextInt();
			smallestValue = Math.min(smallestValue, numberList[i]);
			largestValue  = Math.max(largestValue, numberList[i]);
			if(numberList[i] % 2 == 0){
				largestEvenValue = Math.max(largestEvenValue, numberList[i]);
				evenNumberSum += numberList[i];
			}
		}
		
		System.out.println("Total numbers entered: " + numberList.length);
		System.out.println("The smallest value you entered is: " + smallestValue);
		System.out.println("The largest value you entered is: " + largestValue);
		System.out.println("The largest even value you entered is: " + largestEvenValue);
		System.out.println("The sum of all even numbers you entered is: " + evenNumberSum);
		
		for(int i = 0; i <= (numberList.length - 1); i++){
			System.out.println("Value " + (i + 1) + ": " + numberList[i]);
		}
	}
}
