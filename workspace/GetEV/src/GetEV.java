import java.util.*;

public class GetEV {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("This program calculates EV from stats");
		System.out.println("Enter your stats below");
		
		System.out.print("Enter HP: ");
		int hp = console.nextInt();
		
		System.out.print("Enter IV: ");
		int iv = console.nextInt();
		
		System.out.print("Enter BaseHP: ");
		int bhp = console.nextInt();
		
		System.out.print("Enter Level: ");
		int level = console.nextInt();
		
		System.out.println("Your EV is " + calcEV(hp, iv, bhp, level));
	}
	
	public static int calcEV(int hp, int iv, int bhp, int level){
		int ev = (((hp - 10) * 100) / level - 2 * bhp - iv -100) *4;
		return ev;
	}
}
