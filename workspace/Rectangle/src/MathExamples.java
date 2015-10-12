public class MathExamples {

	public static void main(String[] args) {
		System.out.println(sumIntegers(100));
	}
	public static int sumIntegers(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		return sum;
	}
}
