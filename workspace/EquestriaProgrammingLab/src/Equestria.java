public class Equestria {
	public static void main(String[] args) {
		System.out.println(distance(31, 9, 34 , 16));
		System.out.println(roadTrip(15));
		System.out.println();
	}
	
	
	public static double distance(int x1, int x2, int y1, int y2){
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));		
	}
	public static double roadTrip(double diameter){
		return diameter * Math.PI;
	}
	public static double angle(int x1, int y1, int x2, int y2, int x3, int y3){
		//x1 y1 = City A
		//x2 y2 = City B
		//x3 y3 = City C
		//http://mathworld.wolfram.com/LawofCosines.html
		
		double sideA = distance(x1, y1, x2, y2);
		double sideB = distance(x2, y2, x3, y3);
		double sideC = distance(x3, y3, x1, y1);
		
		double angleA = Math.toDegrees(Math.acos((Math.pow(-sideA, 2) + Math.pow(sideB, 2) + Math.pow(sideC, 2))/(2 * sideB * sideC)));
		//double angleB = (Math.pow(sideA, 2) - Math.pow(sideB, 2) + Math.pow(sideC, 2))/(2 * sideA * sideC);
		//double angleC = (Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2))/(2 * sideA * sideB);
		
		return angleA;
		
	}
	
}
