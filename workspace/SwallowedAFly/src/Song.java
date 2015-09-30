public class Song {
	public static void main(String[] args)
	{
		swallow("Fly");
		end("But it's only a fly \nI Think I'll cry \nShe gulped it out of the sky \nOh, my!");
		swallow("spider");
		System.out.println("That wiggled and jiggled and tickeled inside her.");
		spider();
		end("Sigh");
		swallow("bird");
		System.out.println("How absurd! She swallowed a bird!");
		bird();
		end("She'll leave us high and dry");
		swallow("cat");
		System.out.println("Imagine that! She swallowed a cat.");
		cat();
		end("I hope it's a lie.");
		swallow("dog");
		System.out.println("She went whole hog to swallow the dog.");
		dog();
		end("There's a tear in my eye");
		swallow("cow");
		System.out.println("I don't know how she swallowed the cow");
		cow();
		end("I'd rather have ham on rye. \nAnd she had a fron on the sly. \nShe did it one try.");
		swallow("horse");
		System.out.println("She died of course.");
		System.out.println("It was the last course.");
		System.out.println("I'm filled with remorse.");
		System.out.println("What's left to say...");
		System.out.println("Even the artist is crying.");
		System.out.println("We'll miss her dearly.");
		System.out.println("It is such a loss.");
		System.out.println("She had no time to floss.");
		System.out.println("She missed out on the sauce,");
		System.out.println("\nMoral: Never swallow a horse.");
		
		
		
		
		



	}
	public static void swallow(String Name){
		System.out.println("There was an old lady who swallowed a " + Name);
	}
	public static void end(String endText){
		System.out.println("I don't know why");
		System.out.println("she swallowed the fly");
		System.out.println("Perhaps she'll die");
		System.out.println(endText);
		System.out.println("");
	}
	
	public static void spider(){
		System.out.println("She swallowed the spider to catch the fly.");
	}
	public static void bird(){
		System.out.println("She swallowed the bird to catch the spider.");
		spider();
	}
	public static void cat(){
		System.out.println("She swallowed the cat to catch the bird.");
		bird();
	}
	public static void dog(){
		System.out.println("She swallowed the dog to catch the cat.");
		cat();
	}
	public static void cow(){
		System.out.println("She swallowed the cow to catch the dog.");
		dog();
	}
	public static void horse(){
		System.out.println("She swallowed the horse to catch the cow.");
		cow();
	}
	
}
