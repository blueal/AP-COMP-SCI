
public class RecursivePowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 5));
	}
	
	public static int power(int a, int n){
		if(n == 0){
			return 1;
		}
		else{
			return a * power(a, n-1);
		}
	}

}
