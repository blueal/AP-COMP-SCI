package textExcel;

public class FormulaCell extends RealCell {

	public FormulaCell(String text) {
		super(text);
	}

	@Override
	public double getDoubleValue() {
		String textString = this.fullCellText();
		int start = textString.indexOf("(");
		textString = textString.substring(start + 1, textString.length() - 1);
		
		String[] text = textString.split(" ");
		
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
