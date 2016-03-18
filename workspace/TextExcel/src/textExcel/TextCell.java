package textExcel;

public class TextCell implements Cell {
	
	private String fullCellText;

	public TextCell(String text) {
		this.fullCellText = text;
	}

	@Override
	public String abbreviatedCellText() {
		String output = this.fullCellText.substring(0, this.fullCellText.length());
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
		return "\"" + this.fullCellText + "\"";
	}

}
