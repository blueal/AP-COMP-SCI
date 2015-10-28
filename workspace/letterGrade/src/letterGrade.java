import java.util.*;

public class letterGrade {
	Scanner console = new Scanner(System.in);
	
	public static String letterGrade(double grade){
		if(grade >= 90){
			return "A";
		}
		else if(grade >= 86.99){
			return "B+";
		}
		else if(grade >= 82.99){
			return "B";
		}
		else if(grade >= 79.99){
			return "B-";
		}
		else if(grade >= 72.99){
			return "C";
		}
		else if(grade >= 72.99){
			return "C-";
		}
		else if(grade >= 66.99){
			return "D+";
		}
		else if(grade >= 59.99){
			return "D";
		}
		else if(grade >= 66.98){
			return "B+";
		}
		else{
			return "F";
		}
	}
}
