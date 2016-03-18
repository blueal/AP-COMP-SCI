package textExcel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
import textExcel.TestsALL.Helper;

public class TextExcel
{
	public static void main(String[] args)
	{
		/*TESTING
		 *
		String test = "A20";
		System.out.println(Character.isLetter((char) test.charAt(0)));
		
		System.out.println(Character.isDigit((char) test.charAt(1)));
		
		*
		 * 
		 *
		
		
		
        SpreadsheetLocation loc = new SpreadsheetLocation("L20");
        System.out.println(loc.getRow());
        System.out.println(loc.getCol());
        */
		
		Spreadsheet spreadsheet = new Spreadsheet();
		Scanner console = new Scanner(System.in);
		
		String input = "";
		boolean running = true;
		while(running){
			input = console.nextLine();
			if(input.equals("quit")){
				running = false;
			}
			else{
				System.out.println(spreadsheet.processCommand(input));
			}
			
		}
	}
}
