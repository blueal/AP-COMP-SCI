
public class main {

	public static void main(String[] args) {
		Kennel kennel = new Kennel();
		Dog dog1 = new Dog("ben");
		Dog dog2 = new Dog("max");
		Dog dog3 = new Dog("sam");
		LoudDog louddog1 = new LoudDog("tim");
		LoudDog louddog2 = new LoudDog("dim");
		Cat cat1 = new Cat("bim");
		Cat cat2 = new Cat("sim");
		
		kennel.addPet(dog1);
		kennel.addPet(dog2);
		kennel.addPet(dog3);
		kennel.addPet(louddog1);
		kennel.addPet(louddog2);
		kennel.addPet(cat1);
		kennel.addPet(cat2);
		
		kennel.allSpeak();
	}

}
