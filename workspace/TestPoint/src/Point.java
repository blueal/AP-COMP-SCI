
public class Point {
	private double x = 0.0;
	private double y = 0.0;
	
	public String toString(){
		return "(" + x + ", " + y + ")";
	}

	
	public double distanceFromOrigin(){
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	
	public void setX(double input){
		x = input;
	}
	public void setY(double input){
		y = input;
	}
}
