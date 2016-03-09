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
		command = command.toLowerCase();
		if(command.equals("print")){
			return this.getGridText();
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
		// TODO Auto-generated method stub
		return null;
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
