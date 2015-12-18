
public class Point {

	private double r = 0;
	private double theta = 0;
	
	public String toString(){
		return "(" + getX() + ", " + getY() + ")";
	}

	public Point(){
		setLocation(0, 0);
	}

	public Point(double x, double y){
		setLocation(x, y);
	}
	public double distanceFromOrigin(){
		return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
	}
	
	public double getX(){
		
		return (r) * (Math.cos(theta));
	}
	public double getY(){
		return (r) * (Math.sin(theta));
	}
	
	public void setLocation(double setx, double sety){
		r = Math.sqrt((setx * setx) + (sety * sety));
		theta = Math.atan(sety / setx);
	}
	public void setX(double input){
		setLocation(input, getY());
	}
	public void setY(double input){
		setLocation(getX(), input);
	}
}
