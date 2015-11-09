package calculator;
import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
    	//Initialize Scanner and Variables
    	Scanner console = new Scanner(System.in);
    	boolean takeInput = true;
    	
    	//Start a while loop to continuously take input until you type "quit"
    	while(takeInput){
    		//Take input and store it
    		String input = console.nextLine();
    		
    		//Check if they are a quitter
    		if(input.equalsIgnoreCase("quit")){
    			//exit the loop
    			takeInput = false;
    		}
    		else{
    			//Let's parse the input and print it
    			System.out.println(produceAnswer(input));
    		}
    	}
    	//System.out.print(produceAnswer(console.nextLine()));

    }
       
    /**
     *    ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code.
     *  
     *  This function takes a String 'input' and produces the result. The input is a string that needs to be evaluated.  
     *  For your program, this will be the user input. For example, 
     *          input ==> "1 + 3"
     *  the function should return the result of the expression after it has been calculated:
     *          return ==> "4"
     *  If there is an error in the user input, the appropriate error message is returned.
     *           
     * @param input     the arithmetic expression to be evaluated
     * @return          the result of the arithmetic expression or an error message
     */
    public static String produceAnswer(String input)
    { 

    	
    	int spaceCount = 0;
    	int index = 0;
    	int arrayCount = 0;
    	for(int i = 0; i < input.length(); i++){
    		if(input.substring(i, i +1) == " "){
    			spaceCount++;
    		}
    	}
    	
    	String[] numbers = new String[spaceCount + 5];
    	
    	for(int i = 0; i < input.length(); i++){
    		if(input.substring(i, i + 1).equals(" ")){
    			System.out.println("FOUND A SPACE");
    			numbers[arrayCount] = input.substring(index, i + 1);
    			System.out.println(input.substring(index, i + 1));
    			index = i + 1;
    			arrayCount++;
    		}
    		
    		if(i == input.length()){
    			for(int j = input.length() - 1; j >= 0; j--){
    	    		//Check if there's a space
    	    		if(input.substring(j, j + 1).equals(" ")){
    	    			//There's a space! Save the last Operand.
    	    			numbers[arrayCount] = input.substring(i + 1);
    	    			System.out.println("WE GOT THE LAST NUMBER");
    	    		}
    	    	}
    		}
    	}
    	
    	
    	/*We will scan from right to left
    	for(int i = input.length() - 1; i >= 0; i--){
    		//Check if there's a space
    		if(input.substring(i, i + 1).equals(" ")){
    			//There's a space! Save the last Operand.
    			lastOperand = input.substring(i + 1);
    			input = input.substring(0, i);
    		}
    	}
    	*/
    	//No space detected, return everything
		return numbers[0];
		
        
    }

    
    /**
     * You may find this function useful in determining if a string value is a valid integer or not. If you call Integer.parseInt()
     * on a string that is not a valid integer, a NumberFormatException will be thrown and your program will terminate. In order to 
     * not have your program terminate on invalid integers, call this function to determine if the string is a valid integer before 
     * parsing it as an integer value.  
     * 
     * @param strVal    the string expression to test to see if it's an integer
     * @return          true if string expression is an integer, false otherwise
     */
    public static boolean isValidNumber(String strVal)
    {
        try
        {
            Integer.parseInt(strVal);             
        }
        catch (NumberFormatException e) 
        {
            return false;
        }
        return true;        
    }
    
    /**
     * You may find the gcd() and lcm() functions helpful if you decide to do the fraction values extra credit work. 
     * These functions implement Euclid's algorithm for finding GCD (greatest common divisor) and LCM (least common multiple).
     *  
     * @param a     first number
     * @param b     second number
     * @return      greatest common divisor or least common multiple of a and b
     */   
    public static int gcd(int a, int b)
    {
        a = Math.abs(a); 
        b = Math.abs(b); 
        while (b > 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int lcm(int a, int b)
    {
        a = Math.abs(a); 
        b = Math.abs(b); 
        return a * (b / gcd(a, b));
    }   
    
    
    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
