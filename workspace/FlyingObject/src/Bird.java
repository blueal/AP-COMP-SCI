
public class Bird extends Animal implements FlyingObject {
	
	public Bird(int age){
		this.setAge(age);
	}
	public void fly(){
		System.out.println("Bird flying");
	}
}
