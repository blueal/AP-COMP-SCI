import java.util.Scanner;

public class RockPaperScissorsCompare {
	public static void main(String[] args){
		//Initialize Percentage Variables
		double player1percent = 0.0;
		double player2percent = 0.0;
		
		//Initialize Scanner
		Scanner console = new Scanner(System.in);
		
		//Initialize Score Array
		int[][] stats = new int[3][4];
		stats[1][1] = 0;
		stats[1][2] = 0;
		stats[1][3] = 0;
		stats[2][1] = 0;
		stats[2][2] = 0;
		stats[2][3] = 0;
		//1 - Number of rounds played
		//2 - Number of rounds won
		//3 - total number of moves
		

		for(int i = 1; i <= 2; i++){	//Run a for loop (1-2) for each player
			//Announce who your checking
			System.out.println("Player " + i + ":");
			
			//Ask for rounds played, take input and store it
			System.out.print("Number of rounds played: ");
			stats[i][1] = console.nextInt();
			
			//Ask for rounds won, take input and store it
			System.out.print("Number of rounds won: ");
			stats[i][2] = console.nextInt();
			
			//Ask for total moves, take input and store it
			System.out.print("Total number of moves: ");
			stats[i][3] = console.nextInt();
			
			//Old percentage storer --> stats[i][4] = ((stats[i][2] * 1000) / (stats[i][1] )) / 10;
			//turns out it's better to store this as a double
			
			//Check whos the player, calculate percentage and store it into the corresponding double variable.
			if(i == 1){
				player1percent = ((stats[i][2]) / (double)(stats[i][1]) ) * 100;
			}
			else{
				player2percent = ((stats[i][2]) / (double)(stats[i][1]) ) * 100;
			}
		}
		if(player1percent == player2percent){	//Check if it's a tie
			//TIE
			System.out.println("IT'S A TIE IN WIN PERCENTAGE! Both players have exactly " + player1percent + "% win percentage.");
			if(stats[1][3] == stats[2][3]){		//Check if it's a dead tie in matches
				//IT'S A DEAD TIE
				System.out.print("It's a dead tie! Both players have a " + stats[1][4] + "% win percentage and made exactly " + stats[1][3] + " moves.");
			}
			else if(stats[1][3] < stats[2][3]){	//Check if player 1 is better in matches
				System.out.print("Player 1 Wins because he has only made " + stats[1][3] + " moves while Player 2 has made " + stats[2][3] + " moves.");
			}
			else{ 								//Player 2 is defaultly better
				System.out.print("Player 2 Wins because he has only made " + stats[2][3] + " moves while Player 2 has made " + stats[1][3] + " moves.");
			}
		}
		else if(player1percent > player2percent){	//Check if player 1 has a better percentage
			System.out.println("Player 1 has won because he has a " + player1percent + "% win percetage while player 2 has " + player2percent + "%.");
		}
		else if(player1percent < player2percent){	//Check if player 2 has a better percentage
			System.out.println("Player 2 has won because he has a " + player2percent + "% win percetage while player 1 has " + player1percent + "%.");
		}
	}
}