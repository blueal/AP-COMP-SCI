
import java.io.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;
 
public class DrinkTest
{
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
    
    @Test
    public void testDrink()
    {
        Drink drink = new Drink("some drink", 10);
    }
    
    
  
     // Uncomment this test when you are ready to test SugarFreeDrink class.
    
    @Test
    public void testSugarFreeDrink()
    {
        SugarFreeDrink drink = new SugarFreeDrink("diet coke", true);
        
        assertEquals(20, drink.getOunces());
        
        output.reset();
        drink.printLabel();
        assertEquals("Enjoy refreshing diet coke with 0 g of sugar.", output.toString().trim());
        
        output.reset();
        drink.printDrinkLabel();
        assertEquals("This drink is not natural.", output.toString().trim());
        
        drink = new SugarFreeDrink("diet coke", false);
        output.reset();
        drink.printDrinkLabel();
        assertEquals("This drink has no artificial sweeteners.", output.toString().trim());
    }
 
    
    
    
     // Uncomment this test when you are ready to test FrozenDrink class.
     
    @Test
    public void testFrozenDrink()
    {
        FrozenDrink drink = new FrozenDrink("iced lemonade", 10);
        assertEquals(8, drink.getOunces());
        
        drink = new FrozenDrink("iced lemonade", 10, 4);
        assertEquals(4, drink.getOunces());
        
        assertEquals("frozen", drink.getState());
        
        output.reset();
        drink.printLabel();
        assertEquals("Enjoy refreshing iced lemonade with 10 g of sugar.", output.toString().trim());
        
        output.reset();
        assertEquals(false, drink.chug(3));
        assertEquals("You cannot gulp more than 2 ounces or else you'll get brain freeze!", output.toString().trim());
        assertEquals(4, drink.getOunces());
        
        output.reset();
        assertEquals(true, drink.chug(2));
        assertEquals("Glug, glug, glug! You have 2 oz left.", output.toString().trim());        
    }
    
    
    
      
    // Uncomment this test when you are ready to test AlcoholDrink class.
    
    @Test
    public void testAlcoholDrink()
    {
        AlcoholDrink drink = new AlcoholDrink("margarita", 8);
        
        assertEquals(5, drink.getOunces());
        
        output.reset();
        drink.printLabel();
        assertEquals("You must be 21 years old or older to drink this. Enjoy refreshing margarita with 8 g of sugar.", output.toString().trim());

        assertEquals(false, drink.chug(9));
        assertEquals(true, drink.chug(4));
        assertEquals(true, drink.chug(1));
        assertEquals(false, drink.chug(2));
        assertEquals(4, drink.getMaxGulp());        
    }
    
    
    
    
      
     //Uncomment this test when you have all Drink subclasses implemented.
   
    @Test
    public void testExtends()
    {
        Drink[] drinks = { new SugarFreeDrink("diet coke", true),
                           new FrozenDrink("iced lemonade", 10),
                           new AlcoholDrink("margarita", 15)
                         };
        
        assertEquals(20, drinks[0].getOunces());
        assertEquals(8, drinks[1].getOunces());
        assertEquals(5, drinks[2].getOunces());
    }
    
     
}
