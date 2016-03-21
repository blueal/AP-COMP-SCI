package textExcel;

public class ValueCell extends RealCell {

	public ValueCell(String text) {
		super(text);
		System.out.println("VALUE CELL: " + text);
	}

	@Override
	public double getDoubleValue() {
		return Double.parseDouble(this.fullCellText());
	}

}
