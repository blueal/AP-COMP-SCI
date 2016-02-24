
public class MainTest
{
    public static void main(String[] args)
    {        
        Bird bird = new Bird(10);                
        Elephant elephant = new Elephant(20);
         
        System.out.println("The animals are:");
        displayAnimal(bird);
        displayAnimal(elephant);
        System.out.println();        
    }

    public static void displayAnimal(Animal animal)
    {
        System.out.println(animal.getName() + " " + animal.getAge());
    }   
 }
