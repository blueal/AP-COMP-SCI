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
    		System.out.print("> ");
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
    		if(input.substring(i, i + 1).equals(" ")){
    			spaceCount++;
    		}
    	}
    	
    	
    	if(spaceCount == 1){
    		return "<ERROR> Invalid expression format.";
    	}
    	else if(spaceCount == 0){
    		return input;
    	}
    	
    	String[] numbers = new String[spaceCount + 1];
    	
    	main: for(int i = 0; i < input.length(); i++){
    		boolean operator = (arrayCount % 2 == 1);
    		if(i < input.length() - 1){
    			//Find and store everything except for the last operator
	    		if(input.substring(i, i + 1).equals(" ")){
	    			String item = input.substring(index, i);
	    			
	    			
	    			if(operator){
	    				if(!isValidOperator(item)){
	    					return "<ERROR> Invalid operator encountered: " + item;
	    				}
	    				
	    			}
	    			else{
	    				if(!isValidNumber(item)){
	    					return "<ERROR> Invalid value: " + item;
	    				}
	    				if(item.equals("0") && arrayCount > 0){
	    					if(numbers[arrayCount - 1].equals("/")){
	    						return "<ERROR> Cannot divide by zero.";
	    					}
	    				}
	    				
	    			}
	    			
	    			numbers[arrayCount] = item;
	    			index = i + 1;
	    			arrayCount++;
	    			
	    		}
    		}else{
    			//Find and store last operator
				for(int j = input.length() - 1; j >= 0; j--){
		    		//Check if there's a space
		    		if(input.substring(j, j + 1).equals(" ")){
		    			//There's a space! Save the last Operand.
		    			String item = input.substring(j + 1);
	    				
		    			if(isValidNumber(item)){
		    				if(item.equals("0") && numbers[arrayCount - 1].equals("/")){
		    					return "<ERROR> Cannot divide by zero.";
		    				}
		    			}
		    			else if(isValidOperator(item)){
		    				return "<ERROR> Invalid expression format.";
		    			}
		    			else if(operator){
		    				return "<ERROR> Invalid operator encountered: " + item;
		    			}
		    			else {
		    				return "<ERROR> Invalid value: " + item;
		    			}
		    			
		    			numbers[arrayCount] = item;
		    			break main;
		    		}
		    	}
				
    		}
    	}
    	
    	if(numbers.length % 2 == 0){
    		//The test case testErrorFinal9() requires I put this after we parse the input
    		return "<ERROR> Invalid expression format.";
    	}
    	
    	int output = Integer.parseInt(numbers[0]);
    	for(int i = 1; i < numbers.length - 1; i += 2){
    		
        	if(numbers[i].equals("+")){
        		output += Integer.parseInt(numbers[i + 1]);
        	}
        	else if(numbers[i].equals("-")){
        		output -= Integer.parseInt(numbers[i + 1]);
        	}
        	else if(numbers[i].equals("/")){
        		//Divide by zero is checked when parsing input
    			output /= Integer.parseInt(numbers[i + 1]);
        	}
        	else if(numbers[i].equals("*")){
        		output *= Integer.parseInt(numbers[i + 1]);
        	}
    	}
    	
    	return Integer.toString(output);

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
    public static boolean isValidOperator(String input){
    	return (input.equals("+") || input.equals("-") || input.equals("/") || input.equals("*"));
    }
}
