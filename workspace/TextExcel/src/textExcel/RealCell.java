package textExcel;

public abstract class RealCell implements Cell {
	
	private String fullCellText;

	public RealCell(String text) {
		this.fullCellText = text;
		System.out.println("REAL CELL: " + text);
	}

	@Override
	public String abbreviatedCellText() {
		String output = this.getDoubleValue() + "";
		if(output.length() < 10){
			for(int i = output.length(); i < 10; i++){
				output += " ";
			}
		}
		else{
			output = output.substring(0, 10);
		}
		return output;
	}

	@Override
	public String fullCellText() {
		return this.fullCellText;
	}
	
	public abstract double getDoubleValue();

}
