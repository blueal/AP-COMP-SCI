package textExcel;

public abstract class RealCell implements Cell {
	
	private String fullCellText;

	public RealCell(String text) {
		this.fullCellText = "test";
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
	
	public abstract double getDoubleValue();

}
