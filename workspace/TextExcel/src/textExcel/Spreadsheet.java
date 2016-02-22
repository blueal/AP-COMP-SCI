package textExcel;

public class Spreadsheet implements Grid {
	
	private Cell[][] Grid;
	
	
	public Spreadsheet(){
		Grid = new Cell[20][12];
	}
	@Override
	public String processCommand(String command) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRows() {
		return this.Grid[0].length;
	}

	@Override
	public int getCols() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cell getCell(Location loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText() {
		// TODO Auto-generated method stub
		return null;
	}

}
