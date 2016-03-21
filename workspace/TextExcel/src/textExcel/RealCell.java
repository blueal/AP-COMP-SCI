package textExcel;

public abstract class RealCell implements Cell {
	
	private String fullCellText;

	public RealCell(String text) {
		this.fullCellText = text;
	}

	@Override
	public String abbreviatedCellText() {
		String output = this.fullCellText;
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
