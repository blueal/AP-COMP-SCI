package textExcel;

public class FormulaCell extends RealCell {

	public FormulaCell(String text) {
		super(text);
	}

	@Override
	public double getDoubleValue() {
		String[] text = this.fullCellText().split(" ");
		
		double number = Double.parseDouble(text[1]);
		for(int i = 0; i < text.length; i += 2){
			if(text[i].equals("+")){
				number += Double.parseDouble(text[i+1]);
			}
			else if(text[i].equals("-")){
				number -= Double.parseDouble(text[i+1]);
			}
			else if(text[i].equals("/")){
				number /= Double.parseDouble(text[i+1]);
			}
			else if(text[i].equals("*")){
				number *= Double.parseDouble(text[i+1]);
			}
		}
		return number;
	}

}
