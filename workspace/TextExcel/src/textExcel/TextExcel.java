package textExcel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
import textExcel.TestsALL.Helper;

public class TextExcel
{
	public static void main(String[] args)
	{
        SpreadsheetLocation loc = new SpreadsheetLocation("L20");
        System.out.println(loc.getRow());
		
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
