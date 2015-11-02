import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args){
		/**
		 * 1 = rock
		 * 2 = paper
		 * 3 = scissors
		 * 					if(aiMove == 1){
						System.out.println("AI: ROCK");
						moves++;
					}
					else if(aiMove == 2){
						System.out.println("AI: PAPER");
						System.out.println()
					}
					else if(aiMove == 3){
						System.out.println("AI: SCISSORS");
					}
		 */
		Scanner console = new Scanner(System.in);
		String move = "";
		int rawAIMove = 0;
		String aiMove = "";
		int round = 1;
		int moves = 1;
		boolean playing = true;
		while(playing){
			System.out.print("Player 1: ");
			move = console.next(); 
			rawAIMove = (int)(3 * Math.random() + 1);
			if(rawAIMove == 1){
				aiMove = "rock";
			}
			else if(rawAIMove == 2){
				aiMove = "paper";
			}
			else if(rawAIMove == 3){
				aiMove = "scissors";
			}
			String winner = "";
			if(move.equalsIgnoreCase("quit")){
				playing = false;
			}
			else if(validInput(move)){
				System.out.println("AI: " + aiMove);
				if(move.equalsIgnoreCase(aiMove)){
					//TIE
					System.out.println("TIE!");
					moves++;
				}
				else if(move.equalsIgnoreCase("rock") && aiMove.equalsIgnoreCase("scissors") || move.equalsIgnoreCase("paper") && aiMove.equalsIgnoreCase("rock") || move.equalsIgnoreCase("scissors") && aiMove.equalsIgnoreCase("paper")){
					//WIN
					System.out.println("Round 1 Outcome: Player 1 \t Round: " + round + " \t Moves Taken: " + moves);
					round++;
				}
				else{
					//LOSE
					System.out.println("Round 1 Outcome: AI \t Round: " + round + " \t Moves Taken: " + moves);
					round++;
				}
			}
			else{
				System.out.println("You entered an incorrect value, please try again");
			}
		}
		
	}
	public static boolean validInput(String input){
		if(input.equalsIgnoreCase("rock") || input.equalsIgnoreCase("paper") || input.equalsIgnoreCase("scissors")){
			return true;
		}
		else{
			return false;
		}
	}
	
}
