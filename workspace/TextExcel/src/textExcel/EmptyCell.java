package textExcel;

public class EmptyCell implements Cell {

	public String abbreviatedCellText;
	public String fullCellText;
	
	public EmptyCell(){
		this.abbreviatedCellText = "";
		this.fullCellText = "";
	}

	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return null;
	}

}
