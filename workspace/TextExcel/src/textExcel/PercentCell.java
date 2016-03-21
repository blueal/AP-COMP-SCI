package textExcel;

public class PercentCell extends RealCell {

	public PercentCell(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDoubleValue() {
		return Double.parseDouble(this.fullCellText().substring(0, this.fullCellText().length() - 1));
	}

}
