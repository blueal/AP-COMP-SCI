package textExcel;

public class FormulaCell extends RealCell {
	
	private Spreadsheet theSpreadsheet;

	public FormulaCell(String text, Spreadsheet theSpreadsheet) {
		super(text);
		this.theSpreadsheet = theSpreadsheet;
	}

	@Override
	public double getDoubleValue() {
		String textString = this.fullCellText();
		int start = textString.indexOf("(");
		textString = textString.substring(start + 1, textString.length() - 1);
		
		String[] text = textString.split(" ");
		
		if(text[1].equalsIgnoreCase("SUM")){
			//Only Sum the range of numbers
			String[] cells = text[2].split("-");
			SpreadsheetLocation topLeft = new SpreadsheetLocation(cells[0]);
			SpreadsheetLocation bottomRight = new SpreadsheetLocation(cells[1]);
			
			double total = 0;
			
			for(int row = topLeft.getRow(); row <= bottomRight.getRow(); row++){
				for(int col = topLeft.getCol(); col <= bottomRight.getCol(); col++){
					
					total += ((RealCell) this.theSpreadsheet.getCell(row, col)).getDoubleValue();
					
				}
			}
			
			return total;
		}
		
		if(text[1].equalsIgnoreCase("AVG")){
			//Only Average the range of numbers
			String[] cells = text[2].split("-");
			SpreadsheetLocation topLeft = new SpreadsheetLocation(cells[0]);
			SpreadsheetLocation bottomRight = new SpreadsheetLocation(cells[1]);
			
			double total = 0;
			int tally = 0;
			
			for(int row = topLeft.getRow(); row <= bottomRight.getRow(); row++){
				for(int col = topLeft.getCol(); col <= bottomRight.getCol(); col++){
					
					total += ((RealCell) this.theSpreadsheet.getCell(row, col)).getDoubleValue();
					tally++;
					
				}
			}
			
			return total / (double) tally;
		}
		
		double number = getNumber(text[1]);
		for(int i = 0; i < text.length; i += 2){
			if(text[i].equals("+")){
				number += getNumber(text[i+1]);
			}
			else if(text[i].equals("-")){
				number -= getNumber(text[i+1]);
			}
			else if(text[i].equals("/")){
				number /= getNumber(text[i+1]);
			}
			else if(text[i].equals("*")){
				number *= getNumber(text[i+1]);
			}
		}
		return number;
	}
	
	private double getNumber(String input){
		try{
			return Double.parseDouble(input);
		}
		catch(NumberFormatException e){
			SpreadsheetLocation loc = new SpreadsheetLocation(input);
			return ((RealCell) this.theSpreadsheet.getCell(loc)).getDoubleValue();
		}
	}

}
