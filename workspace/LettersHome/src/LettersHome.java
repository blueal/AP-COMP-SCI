
public class LettersHome {
	public static void main(String[] args)
	{
		startLetter("Mom");
		classes();
		friends();
		money();
		endLetter();
		
		startLetter("Friend");
		loveLife();
		classes();
		hobbies();
		endLetter();
		
		startLetter("Brother");
		hobbies();
		friends();
		money();
		endLetter();
		

	}
	
	public static void startLetter(String name)
	{
		System.out.println("Dear " + name + ",");
	}
	public static void classes()
	{
		System.out.println("I started AP Computer Science and it is going Great.");

	}
	public static void friends()
	{
		System.out.println("Billy Bob is my newest friend, he is so cool");

	}
	public static void money()
	{
		System.out.println("The real reason I'm writing this letter is because I want money");

	}
	public static void loveLife()
	{
		System.out.println("My girlfriends name is Juel");
	}
	public static void hobbies()
	{
		System.out.println("I started coding as my hobby");
	}
	public static void endLetter()
	{
		System.out.println("Sincerly,\n John\n");
	}
	
}

