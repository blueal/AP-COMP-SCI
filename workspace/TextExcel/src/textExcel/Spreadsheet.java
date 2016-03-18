package textExcel;

public class Spreadsheet implements Grid {
	
	private Cell[][] Grid;
	
	
	public Spreadsheet(){
		Grid = new Cell[20][12]; //[row][col]
		for(int i = 0; i < this.getRows(); i++){
			for(int j = 0; j < this.getCols(); j++){
				this.Grid[i][j] = new EmptyCell();
			}
		}
	}
	@Override
	public String processCommand(String command) {
		//String command = input.toLowerCase();
		if(command.matches("[A-z]\\d?\\d")){
			//Cell display
	        SpreadsheetLocation loc = new SpreadsheetLocation(command);
	        if (getCell(loc) instanceof EmptyCell) {
	        	return "";
	        }
	        else{
	        	return getCell(loc).fullCellText();
	        }
	        
		}
		else if(command.matches("[A-z]\\d?\\d\\s[=]\\s[\"]?.+[\"]")){
			//Set TextCell
			String cell = command.substring(0, command.indexOf(' ')).toUpperCase();
			SpreadsheetLocation loc = new SpreadsheetLocation(cell);
			
			int start = command.indexOf("\"");
			//System.out.println(start);
			String text = command.substring(start + 1, command.length() - 1);
			//System.out.println("(" + text + ")");
			//if(!(getCell(loc) instanceof TextCell)){
				this.Grid[loc.getRow()][loc.getCol()] = new TextCell(text);
			//}

			return "";
		}
		else if(command.matches("(?i)clear\\s[A-z]\\d?\\d")){
			//clear cell
			String cell = command.substring(command.indexOf(' ') + 1).toUpperCase();
			SpreadsheetLocation loc = new SpreadsheetLocation(cell);
			this.Grid[loc.getRow()][loc.getCol()] = new EmptyCell();
			return "";
		}
		else if(command.equalsIgnoreCase("print")){
			//print grid
			return this.getGridText();
		}
		else if(command.equalsIgnoreCase("clear")){
			//clear grid
			for(int i = 0; i < this.getRows(); i++){
				for(int j = 0; j < this.getCols(); j++){
					this.Grid[i][j] = new EmptyCell();
				}
			}
			return "";
		}
		else{
			return "";
		}
	}

	@Override
	public int getRows() {
		return this.Grid.length;
	}

	@Override
	public int getCols() {
		// TODO Auto-generated method stub
		return this.Grid[0].length;
	}

	@Override
	public Cell getCell(Location loc) {
		return this.Grid[loc.getRow()][loc.getCol()];
	}

	@Override
	public String getGridText() {
		String output = "   |";
		
		//Create the header
		for(int i = 0; i < this.getCols(); i++){
			output += (Character.toString((char) (i + 65)));
			output += "         |";
		}
		output+= "\n";
		
		//Do the rows

		for(int i = 0; i < this.getRows(); i++){
			String row = "" + (i + 1);
			for(int j = row.length(); j < 3; j++){
				row += " ";
			}
			row += "|";
			
			for(int j = 0; j < this.getCols(); j++){
				row += this.Grid[i][j].abbreviatedCellText();
				//row += i + " " + j;
				row += "|";
			}
			output += row + "\n";
		}
		return output;
	}

}
