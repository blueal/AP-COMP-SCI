import java.util.ArrayList;
import java.util.List;

public class Kennel
{
	private List<Pet> petList;
	
	public Kennel(){
		this.petList = new ArrayList<Pet>();
	}

	/** @param pet to be added to list. Assume not null.
	 * Postcondition: pet is added to petList
	 */
	public void addPet(Pet pet)
	{
		this.petList.add(pet);
	}

	/** Postcondtion: for each Pet in the kennel, its name
	 * followed by the result of a call to its
	 * speak method is printed to the console,
	 * one line per Pet
	 */
	public void allSpeak()
	{
		for(int i = 0; i < this.petList.size(); i++){
			System.out.println(this.petList.get(i).speak());
		}
	}
	
	
} 