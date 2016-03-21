package textExcel;

public class PercentCell extends RealCell {

	public PercentCell(String text) {
		super(text);
	}

	@Override
	public String abbreviatedCellText(){
		String output = (int) (Double.parseDouble((this.fullCellText().substring(0, this.fullCellText().length() - 1) ))) + "%";
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
	public double getDoubleValue() {
		return Double.parseDouble(
				this.fullCellText().substring(0, this.fullCellText().length() - 1)
				) / 100;
	}

}
