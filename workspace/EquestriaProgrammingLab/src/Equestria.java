public class Equestria {
	public static void main(String[] args) {
		System.out.print("Distance from Baltimare (31, 9) to Manehattan (34, 16) = ");
		System.out.println(distance(31, 9, 34, 16));
		
		System.out.print("Distance from Los Pegasus (6, 6) to Neighagra Falls (22, 18) = ");
		System.out.println(distance(6, 6, 22, 18));
		
		System.out.print("Distance from the Badlands (25, 3) to Ponyville (16, 11) = ");
		System.out.println(distance(25, 3, 16, 11));
		
		System.out.print("The diameter of a circle 15 = ");
		System.out.println(roadTrip(15));
		
		
		//Roadtrip from palomino (10, 5) to cloudsdale (13, 17) to Baltimare (30, 11)
		triangle(10, 5, 13, 17, 30, 11);
		//System.out.println(angle(11, 11, 11));
	}
	
	
	public static double distance(int x1, int x2, int y1, int y2){
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));		
	}
	public static double roadTrip(double diameter){
		return diameter * Math.PI;
	}
	public static void triangle(int x1, int y1, int x2, int y2, int x3, int y3){
		double sideA = distance(x1, y1, x2, y2);
		double sideB = distance(x2, y2, x3, y3);
		double sideC = distance(x3, y3, x1, y1);
		
		System.out.println("Distance from A (" + x1 + ", " + y1 + ") to B (" + x2 + ", " + y2 + ") = " + sideA);
		System.out.println("Distance from B (" + x2 + ", " + y2 + ") to B (" + x3 + ", " + y3 + ") = " + sideB);
		System.out.println("Distance from C (" + x3 + ", " + y3 + ") to B (" + x1 + ", " + y1 + ") = " + sideC);

		
		double angleA = angle(sideA, sideC, sideB);
		double angleB = angle(sideA, sideB, sideC);
		double angleC = angle(sideC, sideB, sideA);
		
		System.out.println("Angle for city A = " + angleA + "°");
		System.out.println("Angle for city B = " + angleB + "°");
		System.out.println("Angle for city C = " + angleC + "°");
		
	}
	public static double angle(double adjacentSideB, double adjacentSideC, double oppositeSideA){
		//x1 y1 = City A
		//x2 y2 = City B
		//x3 y3 = City C
		//http://mathworld.wolfram.com/LawofCosines.html
		
		//double sideA = distance(x1, y1, x2, y2);
		//double sideB = distance(x2, y2, x3, y3);
		//double sideC = distance(x3, y3, x1, y1);
		
		double angle = Math.toDegrees(Math.acos((Math.pow(adjacentSideB, 2) + Math.pow(adjacentSideC, 2) - Math.pow(oppositeSideA, 2))/(2 * adjacentSideB * adjacentSideC)));
		//double angleB = (Math.pow(sideA, 2) - Math.pow(sideB, 2) + Math.pow(sideC, 2))/(2 * sideA * sideC);
		//double angleC = (Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2))/(2 * sideA * sideB);
		
		return angle;
		
	}
	
}
