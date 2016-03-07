package textExcel;

public class SpreadsheetLocation implements Location {

	private String loc;
	
	public SpreadsheetLocation(String loc){
		this.loc = loc;
	}
	
	@Override
	public int getRow() {
		// TODO Auto-generated method stub
		return (Integer.parseInt(this.loc.substring(1))) - 1;
	}

	@Override
	public int getCol() {
		// TODO Auto-generated method stub
		return Character.toUpperCase(this.loc.charAt(0)) - 'A';
	}

}
