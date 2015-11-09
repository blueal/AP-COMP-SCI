import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args){
		/**
		 * 1 = rock
		 * 2 = paper
		 * 3 = scissors
		 * 					
		 */
		Scanner console = new Scanner(System.in);
		
		//Initialize Variables
		String move = "";
		int rawAIMove = 0;
		String aiMove = "";
		int round = 1;
		int moves = 1;
		boolean playing = true;
		
		//While playing is true lets keep playing the game
		while(playing){
			System.out.print("Player 1: ");
			//Take input for the move and convert to single letter lowercase string
			move = console.next().toLowerCase().substring(0, 1);
			
			//Generate number 1 - 3
			rawAIMove = (int)(3 * Math.random() + 1);
			
			//convert number to corresponding single letter
			if(rawAIMove == 1){
				aiMove = "r";
			}
			else if(rawAIMove == 2){
				aiMove = "p";
			}
			else if(rawAIMove == 3){
				aiMove = "s";
			}
			
			//Reset winner variable
			String winner = "";
			
			//Check if the player is a quitter, if so, exit the while loop
			if(move.equals("q")){
				playing = false;
			}
			else if(validInput(move)){ //Check if the move is a valid move, if not, redo it.
				System.out.println("AI: " + aiMove); //Print out the AI move
				if(move.equals(aiMove)){  //Check if they both got the same move
					//IT'S A TIE
					System.out.println("TIE!");
					moves++;
				}
				else if(move.equals("r") && aiMove.equals("s") || move.equals("p") && aiMove.equals("r") || move.equals("s") && aiMove.equals("p")){	//Just check if you won or not
					//YOUR A WINNER
					System.out.println("Round 1 Outcome: Player 1 \t Round: " + round + " \t Moves Taken: " + moves);
					round++;
					moves = 1;
				}
				else{
					//If you didn't tie or win you must have lost
					System.out.println("Round 1 Outcome: AI \t Round: " + round + " \t Moves Taken: " + moves);
					round++;
					moves = 1;
				}
			}
			else{
				//Invalid input detected
				System.out.println("You entered an incorrect value, please try again");
			}
		}
		
	}
	public static boolean validInput(String input){
		//checks if your input is one of the 3 accepted moves
		return (input.equals("r") || input.equals("p") || input.equals("s"));
	}
	public static String translate(String input){
		//Ignore this, it doesn't work and I took out the implementation of it.
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
