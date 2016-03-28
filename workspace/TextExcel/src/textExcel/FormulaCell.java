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
		System.out.println("GETTING: " + input);
		if(input.equalsIgnoreCase("AVG")){
			// TODO Work on cell reference
		}
		else if(input.equalsIgnoreCase("SUM")){
			// TODO Work on cell reference
		}
		else{
			// TODO Work on cell reference
			try{
				return Double.parseDouble(input);
			}
			catch(NumberFormatException e){
				SpreadsheetLocation loc = new SpreadsheetLocation(input);
				return ((RealCell) this.theSpreadsheet.getCell(loc)).getDoubleValue();
			}
		}
	}

}
