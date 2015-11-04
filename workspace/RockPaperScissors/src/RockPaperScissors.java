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
			move = console.next().toLowerCase().substring(0, 1); 
			rawAIMove = (int)(3 * Math.random() + 1);
			if(rawAIMove == 1){
				aiMove = "r";
			}
			else if(rawAIMove == 2){
				aiMove = "p";
			}
			else if(rawAIMove == 3){
				aiMove = "s";
			}
			
			String winner = "";
			if(move.equals("q")){
				playing = false;
			}
			else if(validInput(move)){
				System.out.println("AI: " + translate(aiMove));
				if(move.equalsIgnoreCase(aiMove)){
					//TIE
					System.out.println("TIE!");
					moves++;
				}
				else if(move.equals("r") && aiMove.equals("s") || move.equals("p") && aiMove.equals("r") || move.equals("s") && aiMove.equals("p")){
					//WIN
					System.out.println("Round 1 Outcome: Player 1 \t Round: " + round + " \t Moves Taken: " + moves);
					round++;
					moves = 0;
				}
				else{
					//LOSE
					System.out.println("Round 1 Outcome: AI \t Round: " + round + " \t Moves Taken: " + moves);
					round++;
					moves = 0;
				}
			}
			else{
				System.out.println("You entered an incorrect value, please try again");
			}
		}
		
	}
	public static boolean validInput(String input){
		return (input.equals("r") || input.equals("p") || input.equals("s"));
	}
	public static String translate(String input){
		String[][] translate = new String[3][3];
		translate[0][0] = "r";
		translate[0][1] = "Rock";
		translate[1][0] = "p";
		translate[1][1] = "Paper";
		translate[2][0] = "s";
		translate[2][1] = "Scissors";
		
		for(int i = 0; i <= 2; i++){
			if(translate[i][1].equals(input)){
				return translate[i][1];
			}
		}
		return input;
		
	}
	
}
