public class RollDie6 {
	public static void main(String[] args) {
		//Scanner console = new Scanner(System.in);
		int die1 = 0;
		int die2 = 0;
		int die3 = 0;
		int die4 = 0;
		int die5 = 0;
		int die6 = 0;
		//System.out.print("How many numbers to read: ");
		for(int i = 1; i <= 1000; i++){
			int number = (int) (1 + (6 * Math.random()));
			if (number == 1){
				die1++;
			}
			else if(number == 2){
				die2++;
			}
			else if(number == 3){
				die3++;
			}
			else if(number == 4){
				die4++;
			}
			else if(number == 5){
				die5++;
			}
			else if(number == 6){
				die6++;
			}
		}
		
		System.out.println("1: " + die1);
		System.out.println("2: " + die2);
		System.out.println("3: " + die3);
		System.out.println("4: " + die4);
		System.out.println("5: " + die5);
		System.out.println("6: " + die6);
	
	}
}

