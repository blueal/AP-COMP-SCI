package textExcel;

public class ValueCell extends RealCell {

	public ValueCell(String text) {
		super(Double.parseDouble(text) + "");
	}

	@Override
	public double getDoubleValue() {
		return Double.parseDouble(this.fullCellText());
	}

}
