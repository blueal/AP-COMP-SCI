import java.util.Scanner;
public class DiceGamePig {
	public static void main(String[] args){
		
		//Initialize Arrays and variables
		Scanner console = new Scanner(System.in);
		int[] score = new int[3];
		score[1] = 0;
		score[2] = 0;
		int roll = 0;
		int turn = 1;
		
		while(score[turn] <= 100){ //Check if the current players score is over 100
			
			//Announce the players turn, reset the roll
			System.out.println("Player " + turn + "s turn");
			roll = 0;
			
			while(roll != 1 && score[turn] <= 100){	//Check if the roll is 1, or that the score is over 100, if true exit the turn.
				
				//Check if the player wants to roll or not
				System.out.print("Would you like to roll? (Y/N)");
				
				//Check if they said no, if they did switch turns
				if(console.next().equalsIgnoreCase("n")){
					if(turn == 1){
						turn = 2;
					}
					else{
						turn = 1;
					}
					roll = 1;
				}
				else
				{
					//Roll the special cool awesome six sided die
					roll = (int) (6 * Math.random() + 1);
					
					//Announce the roll
					System.out.println("You have rolled a " + roll);
					
					if(roll == 1){	//Check if the roll is 1
						//Exit the turn
						System.out.println("Sorry, Switching turns.");
						if(turn == 1){
							turn = 2;
						}
						else{
							turn = 1;
						}
					}
					else{
						//Add the roll to the players score
						score[turn] += roll;
					}
				}
			}
		}
		//Check who is the winner
		if(score[1] > score[2]){
			//Player 1 won
			System.out.println("Player 1 has WON with a whopping " + score[1] + " points. Good Job!");
		}
		else{
			//Player 2 won
			System.out.println("Player 2 has WON with a whopping " + score[2] + " points. Good Job!");
		}
		
	}
}
