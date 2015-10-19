public class PokemonStats {
	public static void main(String[] args) {
		System.out.println("Blastoise:");
		System.out.println("HP: " + pokemonHP(79));
		System.out.println("Attack: " + otherStat(83));
		
	}
	public static int pokemonHP(int baseHP){
		return (2 * baseHP) + 110;
	}
	public static int otherStat(int baseStat){
		return (2 * baseStat) + 5;
	}
}
