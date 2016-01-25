
public class Drink
{
    private String name;
    private int gramsOfSugar;
    private int ounces;

    public Drink(String name, int sugar)
    {
        this.name = name;
        this.gramsOfSugar = sugar;
        this.ounces = 8; 
    }

    public Drink(String name, int sugar, int oz)
    {
        this.name = name;
        this.gramsOfSugar = sugar;
        this.ounces = oz;  
    }

    public String getState() { return "liquid"; } 
    
    public int getOunces() { return this.ounces; }

    public boolean chug(int gulp)
    {
        if (this.ounces < gulp)
        {
            System.out.println("Not enough left.");
            return false; 
        }

        System.out.print("Glug, glug, glug! ");
        this.ounces -=gulp;
        System.out.println("You have " + this.ounces + " oz left.");
        return true;
    }

    public void printLabel()
    {
        System.out.print("Enjoy refreshing " + this.name);
        System.out.println(" with " + this.gramsOfSugar + " g of sugar.");
     }

}
