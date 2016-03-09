package textExcel;

public class EmptyCell implements Cell {

	private String abbreviatedCellText;
	private String fullCellText;
	
	public EmptyCell(){
		this.abbreviatedCellText = "          ";
		this.fullCellText = "";
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
