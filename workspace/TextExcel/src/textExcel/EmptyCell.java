package textExcel;

public class EmptyCell implements Cell {

	public String abbreviatedCellText;
	public String fullCellText;
	
	public EmptyCell(){
		this.abbreviatedCellText = "          ";
		this.fullCellText = "          ";
	}

	@Override
	public String abbreviatedCellText() {
		return this.abbreviatedCellText;
	}

	@Override
	public String fullCellText() {
		return this.fullCellText;
	}

}
