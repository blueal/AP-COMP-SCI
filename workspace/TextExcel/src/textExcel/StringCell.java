package textExcel;

public class StringCell implements Cell {
	
	public String abbreviatedCellText;
	public String fullCellText;

	public StringCell(String input){
		this.fullCellText = input;
		if(input.length() > 8){
			this.abbreviatedCellText = input.substring(0, 8);
		}
		else{
			this.abbreviatedCellText = input;
		}
	}
	@Override
	public String abbreviatedCellText() {
		return this.abbreviatedCellText;
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return this.fullCellText;
	}

}
