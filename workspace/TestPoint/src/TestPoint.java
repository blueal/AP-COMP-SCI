
public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.setX(2);
		p1.setY(-2);
		
		System.out.println("P1 is at (" + p1.getX() + ", " + p1.getY() + ")");

		System.out.println("P1 Origin is: " + p1.distanceFromOrigin());
		
		System.out.println(p1);
	}

}
