import java.util.*;

public class PokeBattle {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		battleStart();
		System.out.println("Arcanine sustained "+ damage() + " points damage. HP are now " + Arcanine.hp);
		statsTable();
		
	}
	public static void battleStart(){
		Scanner console = new Scanner(System.in);
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.println("Which Pokemon do you choose?");
		String pokemon = console.next();
		
		if(pokemon.equals("Arcanine")){
			System.out.println("You chose Arcanine!");
		}
		
		System.out.println("It's a Pokemon battle between " + pokemon + " and Zebstrika! Go!");
		
		
	}
	
	public static double damage(){
		Scanner console = new Scanner(System.in);
		System.out.println("Zebstrika Used Thunderbolt!");
		
		System.out.println("Zebstrika what are your stats?");
		System.out.print("Level: ");
		double level = console.nextInt();
		System.out.print("Attack: ");
		double attack = console.nextInt();
		System.out.print("Base: ");
		double base = console.nextInt();
		System.out.print("STAB: ");
		double stab = console.nextDouble();
		
		System.out.println("Trainer, what are your Arcanine's stats?");
		System.out.print("Defense: ");
		Arcanine.defense = console.nextInt();
		System.out.print("HP:");
		Arcanine.hp = console.nextInt();
		
		Random r = new Random();
		double randomValue = .85 + (1.0 - .85) * r.nextDouble();
		double modifier = stab * randomValue;
		
		double damage = (((2 * level + 10) / (250 )) *
				(attack/ (double) Arcanine.defense) *
				(base + 2)) *
				modifier;
		Arcanine.hp -= damage;
		return (int) damage;
	}
	
	
	public static void statsTable(){
		/*Name		Alakazam
		Level 	40
		------------------------------
		HP		96
		ATTACK	52
		DEFENSE	51
		SP. ATK	121
		SP. DEF	81
		SPEED		107
		-------------------------------
		Moves Learned:	Thunder Wave, Hidden Power, Psycho Cut, Recover
*/
		System.out.println("Name\t Arcanine");
		System.out.println("Level\t 40");
		System.out.println("------------------------------");
		System.out.println("HP\t" + Arcanine.hp);
		System.out.println("ATTACK\t" + Arcanine.attack);
		System.out.println("DEFENSE\t" + Arcanine.defense);
		System.out.println("SP. ATK\t" + Arcanine.spAtk);
		System.out.println("SP. DEF\t" + Arcanine.spDef);
		System.out.println("SPEED\t" + Arcanine.speed);
		System.out.println("------------------------------");
		System.out.println("Moves Learned: \t" + Arcanine.movesLearned);
		
	}
}
