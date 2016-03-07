package textExcel;

public class Spreadsheet implements Grid {
	
	private Cell[][] Grid;
	
	
	public Spreadsheet(){
		Grid = new EmptyCell[20][12]; //[row][col]
	}
	@Override
	public String processCommand(String command) {
		// TODO Auto-generated method stub
		return "";
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
		for(int i = 1; i < 26; i++){
			output += (Character.toString((char) (i + 64)));
			output += "         |";
		}
		output+= "\n";
		
		//Do the rows

		for(int i = 1; i < this.getRows(); i++){
			String row = "" + i;
			for(int j = row.length(); j < 3; j++){
				row += " ";
			}
			row += "|";
			
			for(int j = 1; j < this.getCols(); j++){
				//Do each column
			}
			output += row + "\n";
		}
		return output;
	}

}
